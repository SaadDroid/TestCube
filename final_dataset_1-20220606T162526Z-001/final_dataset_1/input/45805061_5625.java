public static AggregateType of(String aggregateStrType) {
    ArgumentChecker.notNull(aggregateStrType, "aggregateStrType");
    
    validateAggregateType(aggregateStrType.toUpperCase());
    
    List<ViewColumnType> types = Lists.newArrayListWithCapacity(VALID_AGGRAGATION_CHARS.size());
    char[] chars = aggregateStrType.toCharArray();
    for (char character : chars) {
      String shortName = String.valueOf(character);
      ViewColumnType type = ViewColumnType.of(shortName);
      if (type == null) {
        throw new IllegalArgumentException("Unsupported aggregate type: " + shortName);
      }
      types.add(type);
    }
    return new AggregateType(types);
  }
