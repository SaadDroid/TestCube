public static Coin parseCoin(final String str) {
        try {
            long satoshis = new BigDecimal(str).movePointRight(SMALLEST_UNIT_EXPONENT).longValueExact();
            return Coin.valueOf(satoshis);
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e); // Repackage exception to honor method contract
        }
    }
