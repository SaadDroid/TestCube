void processParameterDefinitions(MethodInvocation invocation, MethodMdc methodMdc, Set<String> localKeys) {
        Object[] arguments = invocation.getArguments();
        for (int a = 0; a < arguments.length; a++) {
            for (ParameterMdc definition : methodMdc.getParameterDefinitions().get(a)) {
                String key = definition.getKey();
                if (key.isEmpty()) {
                    key = methodMdc.getParameterNames().get(a);
                    if (isNull(key)) {
                        key = synthesizeKey(invocation.getMethod().getName(), a);
                    }
                }
                String expressionString = definition.getExpressionString();
                Object value = expressionString.isEmpty() ? arguments[a] : expressionEvaluator.evaluate(expressionString, arguments[a]);
                putMdc(key, value, definition, localKeys);
            }
        }
    }
