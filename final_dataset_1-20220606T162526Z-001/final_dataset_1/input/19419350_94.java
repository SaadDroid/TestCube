public Coin parse(String str) throws NumberFormatException {
        return Coin.valueOf(parseValue(str, Coin.SMALLEST_UNIT_EXPONENT));
    }
