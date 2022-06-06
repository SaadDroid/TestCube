@Override
  public Double execute(Double value, ValueSpecification valueSpecification, FunctionExecutionContext executionContext) {
    switch (_shiftType) {
      case ABSOLUTE:
        return value + _shift;
      case RELATIVE:
        return value * (1 + _shift);
      default:
        throw new IllegalArgumentException("Unexpected shift type " + _shiftType);
    }
  }
