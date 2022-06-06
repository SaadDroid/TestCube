public static Object convertTypeIfNeeded(Object propertyValue, Schema targetSchema) {

    Object outputPropertyValue = propertyValue;

    // for Maps (e.g., routing policies) we use the set of keys
    if (outputPropertyValue instanceof Map<?, ?>) {
      outputPropertyValue =
          ((Map<?, ?>) outputPropertyValue)
              .keySet().stream().map(Object::toString).collect(ImmutableSet.toImmutableSet());
    }

    // check if a conversion to String or List/Set<String> is needed for complex objects (e.g., VRF)
    if (targetSchema.equals(Schema.STRING)
        && outputPropertyValue != null
        && !(outputPropertyValue instanceof String)) {
      if (outputPropertyValue instanceof ComparableStructure) {
        outputPropertyValue = ((ComparableStructure<?>) outputPropertyValue).getName();
      } else {
        outputPropertyValue = outputPropertyValue.toString();
      }
    } else if ((targetSchema.equals(Schema.list(Schema.STRING))
            || targetSchema.equals(Schema.set(Schema.STRING)))
        && outputPropertyValue instanceof Collection<?>) {
      Collection<?> outputCollection = (Collection<?>) outputPropertyValue;
      if (!outputCollection.isEmpty() && !(outputCollection.iterator().next() instanceof String)) {
        Stream<?> stream =
            outputCollection.stream()
                .map(
                    e ->
                        (e instanceof ComparableStructure)
                            ? ((ComparableStructure<?>) e).getName()
                            : e.toString());
        outputPropertyValue =
            targetSchema.getType() == Type.LIST
                ? stream.collect(ImmutableList.toImmutableList())
                : stream.collect(ImmutableSet.toImmutableSet());
      }
    }

    return outputPropertyValue;
  }
