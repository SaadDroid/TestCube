@Override
    public String execute(List<String> parameterList, TestContext context) {
        if (CollectionUtils.isEmpty(parameterList) || parameterList.size() != 1) {
            throw new InvalidFunctionUsageException("Invalid function parameter usage! Expected single parameter but found: " + parameterList.size());
        }

        return StringEscapeUtils.escapeXml(parameterList.get(0));
    }
