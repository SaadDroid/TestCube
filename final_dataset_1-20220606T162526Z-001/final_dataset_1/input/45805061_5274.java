@Override
  public Double execute(Double structure,
                        ValueSpecification valueSpecification,
                        FunctionExecutionContext executionContext) {
    return structure * randomFactor();
  }
