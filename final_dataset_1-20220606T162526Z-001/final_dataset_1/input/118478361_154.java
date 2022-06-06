@Override
    public String annotation(TDRGElement element, String description) {
        if (StringUtils.isBlank(description)) {
            return "\"\"";
        }
        try {
            Environment environment = makeEnvironment(element);
            Statement statement = this.expressionToNativeTransformer.literalExpressionToNative(element, description, environment);
            return ((ExpressionStatement) statement).getExpression();
        } catch (Exception e) {
            LOGGER.warn(String.format("Cannot process description '%s' for element '%s'", description, element == null ? "" : element.getName()));
            return String.format("\"%s\"", description.replaceAll("\"", "\\\\\""));
        }
    }
