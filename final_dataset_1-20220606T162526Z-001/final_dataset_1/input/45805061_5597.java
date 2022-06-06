public void parameters(Closure<?> body) {
    ParametersDelegate parametersDelegate = new ParametersDelegate();
    body.setDelegate(parametersDelegate);
    body.setResolveStrategy(Closure.DELEGATE_FIRST);
    body.call();
    // check the parameters are all in the binding and have the expected types
    Binding binding = getBinding();
    Map<String, Class<?>> parameters = parametersDelegate.getParameters();
    for (Map.Entry<String, Class<?>> entry : parameters.entrySet()) {
      String varName = entry.getKey();
      Class<?> varType = entry.getValue();
      if (!binding.hasVariable(varName)) {
        throw new DataNotFoundException("Parameter named " + varName + " not found");
      }
      Object varValue = binding.getVariable(varName);
      if (!varType.isInstance(varValue)) {
        throw new IllegalArgumentException("Parameter " + varName + " has type " + varValue.getClass().getName() + ", " +
                                                "required type is " + varType.getName());
      }
    }
  }
