public static List<Type> decode(
            String rawInput, List<TypeReference<Type>> outputParameters) {
        String input = Numeric.cleanHexPrefix(rawInput);

        if (input.isEmpty()) {
            return Collections.emptyList();
        } else {
            return build(input, outputParameters);
        }
    }
