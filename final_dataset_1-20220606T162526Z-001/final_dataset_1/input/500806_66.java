@Override
    public String execute(List<String> parameterList, TestContext context) {
        if (CollectionUtils.isEmpty(parameterList)) {
            throw new InvalidFunctionUsageException("Function parameters must not be empty");
        }

        if (parameterList.size() < 2) {
            throw new InvalidFunctionUsageException("Missing parameter for function - usage jsonPath('jsonSource', 'expression')");
        }

        String jsonSource;
        String jsonPathExpression;
        if (parameterList.size() > 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(parameterList.get(0));
            for (int i = 1; i < parameterList.size() -1; i++) {
                sb.append(", ").append(parameterList.get(i));
            }

            jsonSource = sb.toString();
            jsonPathExpression = parameterList.get(parameterList.size() - 1);
        } else {
            jsonSource = parameterList.get(0);
            jsonPathExpression = parameterList.get(1);
        }

        return JsonPathUtils.evaluateAsString(context.replaceDynamicContentInString(jsonSource), jsonPathExpression);
    }
