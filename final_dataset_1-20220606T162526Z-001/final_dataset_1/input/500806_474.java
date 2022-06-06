@Override
    public String execute(List<String> parameterList, TestContext context) {
        if (CollectionUtils.isEmpty(parameterList)) {
            throw new InvalidFunctionUsageException("Invalid function parameters - must set system property name");
        }

        String propertyName = parameterList.get(0);

        final Optional<String> defaultValue;
        if (parameterList.size() > 1) {
            defaultValue = Optional.of(parameterList.get(1));
        } else {
            defaultValue = Optional.empty();
        }

        return Optional.ofNullable(System.getProperty(propertyName))
                .orElseGet(() -> defaultValue.orElseThrow(() -> new CitrusRuntimeException(String.format("Failed to resolve system property '%s'", propertyName))));
    }
