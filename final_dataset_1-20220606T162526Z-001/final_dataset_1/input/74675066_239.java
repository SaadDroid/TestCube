public static List<String> getSupportedResponseTypes() {
        return Collections.unmodifiableList(SUPPORTED_RESPONSE_TYPES.stream().sorted().collect(Collectors.toList()));
    }
