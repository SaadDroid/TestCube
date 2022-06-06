public String build() {
        if (!parameters.isEmpty()) {
            uriBuilder.setParameters(parameters);
        }
        return uriBuilder.toString();
    }
