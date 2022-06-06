public String execute(List<String> parameterList, TestContext context) {
        if (parameterList == null || parameterList.size() < 2) {
            throw new InvalidFunctionUsageException("Function parameters not set correctly");
        }

        String resultString = parameterList.get(0);

        if (parameterList.size()>1) {
            String searchString = parameterList.get(1);
            resultString = resultString.substring(resultString.indexOf(searchString) + searchString.length());
        }

        return resultString;
    }
