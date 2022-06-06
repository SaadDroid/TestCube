public static Map<Integer, Set<String>> getComponents(QueryHandler graph) {
    int nextComponentId = 0;
    List<Vertex> vertices = new ArrayList<>(graph.getVertices());
    Map<Integer, Set<String>> mapping = new HashMap<>();

    //While there are vertices that do not belong to a component
    while (vertices.size() != 0) {
      //init a new component
      int componentId = nextComponentId++;
      List<Long> nextVertices = Lists.newArrayList(vertices.remove(0).getId());
      mapping.put(
        componentId,
        Sets.newHashSet(graph.getVertexById(nextVertices.get(0)).getVariable())
      );

      //While we find new connected vertices
      while (nextVertices.size() != 0) {
        List<Long> currentVertices = nextVertices;
        nextVertices = new ArrayList<>();
        for (Long vertexId : currentVertices) {
          // Expand each vertex from the previouse iteration
          nextVertices.addAll(
            graph.getEdges()
              .stream()
              .filter(edge ->
                edge.getSourceVertexId().equals(vertexId) ||
                edge.getTargetVertexId().equals(vertexId)
              )
              .map(edge -> edge.getSourceVertexId().equals(vertexId) ?
                edge.getTargetVertexId() : edge.getSourceVertexId()
              ).filter(id -> vertices.removeIf(v -> v.getId() == id))
              .collect(Collectors.toList())
          );
        }

        // Assign all newly found vertices to the component
        mapping.get(componentId).addAll(
          nextVertices
            .stream()
            .map(id -> graph.getVertexById(id).getVariable())
            .collect(Collectors.toList())
        );
      }
    }

    return mapping;
  }
