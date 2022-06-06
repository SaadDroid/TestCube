public static List<Operation> getTopologicallySortedOperations(Set<Operation> operations) {

    Map<String, Operation> operationMap = new HashMap<>();
    Set<String> operationsWithNoIncomings = new HashSet<>();

    for (Operation operation : operations) {
      operationMap.put(operation.getName(), operation);
      if (OperationType.READ == operation.getType()) {
        operationsWithNoIncomings.add(operation.getName());
      }
      // it is common use case that a transform generates some fields from nowhere, in this case, should treat it
      // like a read operation
      if (OperationType.TRANSFORM == operation.getType() && ((TransformOperation) operation).getInputs().isEmpty()) {
        operationsWithNoIncomings.add(operation.getName());
      }
    }

    // Map of operation name to the set of operation names which take the output of the given operation as
    // an input. This map basically represents the adjacency list for operation.
    // For example consider the following scenario:
    //
    // read----------------------write
    //   \                      /
    //    ----parse---normalize
    //
    // The map would contain:
    // read -> [parse, write]
    // parse -> [normalize]
    // normalize -> [write]
    // write -> []
    Map<String, Set<String>> outgoingOperations = new HashMap<>();

    // Map of operation name to the set of operation names outputs of which given operation takes as an input.
    // For example consider the following scenario:
    //
    // read----------------------write
    //   \                      /
    //    ----parse---normalize
    //
    // The map would contain:
    // read -> []
    // parse -> [read]
    // normalize -> [parse]
    // write -> [read, normalize]
    Map<String, Set<String>> incomingOperations = new HashMap<>();

    for (Operation operation : operations) {
      List<InputField> inputFields = new ArrayList<>();
      switch (operation.getType()) {
        case READ:
          // read has no incoming operation
          incomingOperations.put(operation.getName(), new HashSet<>());
          break;
        case TRANSFORM:
          TransformOperation transform = (TransformOperation) operation;
          inputFields.addAll(transform.getInputs());
          break;
        case WRITE:
          WriteOperation write = (WriteOperation) operation;
          inputFields.addAll(write.getInputs());
          // write has no outgoing operation
          outgoingOperations.put(operation.getName(), new HashSet<>());
          break;
      }

      for (InputField inputField : inputFields) {
        // It is possible that the origin for the current input field is not present in the set of
        // operations that this method receives. Reason for this is, the method can be called from
        // handler, in which case we only return the subset of operations.
        //
        // For example: consider following complete set of operations:
        // read----------------------write
        //   \                      /
        //    ----parse---normalize
        //
        // Now if handler receives the request for operations that are responsible for field say "offset"
        // which was written by "write" operation and was read by "read" operation. In this case we only
        // get subset [read, write] which this method receives, however write operation will still have
        // input fields with origin as normalize, which should be ignored for topological sorting.
        if (!operationMap.containsKey(inputField.getOrigin())) {
          continue;
        }
        // Current operation is the outgoing operation for origin represented by the input field.
        Set<String> outgoings = outgoingOperations.computeIfAbsent(inputField.getOrigin(), k -> new HashSet<>());
        outgoings.add(operation.getName());

        // Origin represented by the input field is the incoming operation for the current operation.
        Set<String> incomings = incomingOperations.computeIfAbsent(operation.getName(), k -> new HashSet<>());
        incomings.add(inputField.getOrigin());
      }
    }

    List<Operation> orderedOperations = new ArrayList<>();
    while (!operationsWithNoIncomings.isEmpty()) {
      String current = operationsWithNoIncomings.iterator().next();
      operationsWithNoIncomings.remove(current);
      if (operationMap.get(current) != null) {
        orderedOperations.add(operationMap.get(current));
      }

      // it is possible that there are no outgoings for the field, since it is possible some field is not used in the
      // downstream of plugins
      Iterator<String> outgoingsIter = outgoingOperations.getOrDefault(current, Collections.emptySet()).iterator();
      while (outgoingsIter.hasNext()) {
        String next = outgoingsIter.next();
        outgoingsIter.remove();
        incomingOperations.get(next).remove(current);
        if (incomingOperations.get(next).isEmpty()) {
          operationsWithNoIncomings.add(next);
        }
      }
    }

    // check if any cycles
    // remove the entries which has empty outgoing operations now
    outgoingOperations.entrySet().removeIf(next -> next.getValue().isEmpty());

    if (!outgoingOperations.isEmpty()) {
      throw new IllegalArgumentException(String.format("Cycle detected in graph for operations %s",
                                                       outgoingOperations));
    }

    return orderedOperations;
  }
