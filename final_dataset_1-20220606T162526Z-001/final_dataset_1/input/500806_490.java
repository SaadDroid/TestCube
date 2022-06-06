public String execute(List<String> parameterList, TestContext context) {
        if (CollectionUtils.isEmpty(parameterList)) {
            throw new InvalidFunctionUsageException("Function parameters must not be empty");
        }

        return (parameterList.get(0)).toUpperCase();
    }
