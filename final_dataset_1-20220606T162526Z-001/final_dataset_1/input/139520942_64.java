static Address decodeAddress(String input) {
        return new Address(decodeNumeric(input, Uint160.class));
    }
