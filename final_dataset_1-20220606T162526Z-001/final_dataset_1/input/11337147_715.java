protected Map<String, String> parseFilters(final List<String> parameters) {
        if (parameters == null) {
            return null;
        }
        final Map<String, String> results = new HashMap<>();
        for (final String parameter : parameters) {
            final String[] split = parameter.split("=");
            if (split.length < 2) {
                results.put(split[0], null);
            } else {
                results.put(split[0], parameter.substring(split[0].length() + 1));
            }
        }
        return results;
    }
