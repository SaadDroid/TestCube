static String encodeBool(Bool value) {
        byte[] rawValue = new byte[Type.MAX_BYTE_LENGTH];
        if (value.getValue()) {
            rawValue[rawValue.length - 1] = 1;
        }
        return Numeric.toHexStringNoPrefix(rawValue);
    }
