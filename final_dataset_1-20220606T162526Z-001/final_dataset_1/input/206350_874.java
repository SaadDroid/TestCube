@Override
    public SQLStatement processTemplate(String template, Map<String, ?> parameters) {
        Context context = contextFactory.createContext(parameters);
        return process(template, context);
    }
