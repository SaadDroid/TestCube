public <ValueT> void put(MappingContextProperty<ValueT> property, ValueT value) {
    if (myProperties.containsKey(property)) {
      throw new IllegalStateException("Property " + property + " is already defined");
    }
    if (value == null) {
      throw new IllegalArgumentException("Trying to set null as a value of " + property);
    }
    myProperties.put(property, value);
  }
