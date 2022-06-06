public static Map<String, String> loadArguments(final String[] argv) {
        final Map<String, String> result = new HashMap<>();
        if (argv != null) {
            for (int i = 0; i < argv.length; i++) {
                final String option = argv[i];
                if (option.startsWith("--")) {
                    final int equalPos = option.indexOf('=');
                    final String paramName = option.substring(2, equalPos == -1 ? option.length() : equalPos);
                    if (equalPos != -1) {
                        result.put(paramName, option.substring(equalPos + 1));
                    } else {
                        result.put(paramName, Boolean.TRUE.toString());
                    }
                } else {
                    result.put(option, option);
                }
            }
        }
        return result;
    }
