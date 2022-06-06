public void setObject(Object value) {
    if (value != null && !PropertyValueStrategyFactory.get(value.getClass()).is(value)) {
      throw new UnsupportedTypeException(value.getClass());
    }
    this.value = value;
  }
