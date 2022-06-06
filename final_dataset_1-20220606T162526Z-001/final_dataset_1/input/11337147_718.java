public List<String> getParameterAsList(final String name) {
        return Arrays.asList(getQuery().getValuesArray(name));
    }
