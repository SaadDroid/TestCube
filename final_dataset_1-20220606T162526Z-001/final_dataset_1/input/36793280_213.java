public String resolve(Method method, Object[] arguments, String spelExpression) {
        if (StringUtils.isEmpty(spelExpression)) {
            return spelExpression;
        }

        if (spelExpression.matches(BEAN_SPEL_REGEX) && stringValueResolver != null) {
            return stringValueResolver.resolveStringValue(spelExpression);
        }

        if (spelExpression.matches(METHOD_SPEL_REGEX)) {
            SpelRootObject rootObject = new SpelRootObject(method, arguments);
            MethodBasedEvaluationContext evaluationContext = new MethodBasedEvaluationContext(rootObject, method, arguments, parameterNameDiscoverer);
            Object evaluated = expressionParser.parseExpression(spelExpression).getValue(evaluationContext);

            return (String) evaluated;
        }

        return spelExpression;
    }
