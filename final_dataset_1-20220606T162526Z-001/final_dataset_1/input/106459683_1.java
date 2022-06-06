static void applySystemProperties(final Map<String, String> opts) {
        opts.forEach((key, value) -> {
            if (key.startsWith("-D")) System.setProperty(key.substring(2), value);
        });
    }
