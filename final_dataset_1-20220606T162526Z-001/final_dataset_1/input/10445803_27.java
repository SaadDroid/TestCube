public BigInteger convert(String input,
            Class<? extends BigInteger> targetType,
            Collection<ValidationError> errors) {

        BigDecimal decimal = (BigDecimal) parse(input, errors);

        if (errors.size() == 0) {
            return decimal.toBigInteger();
        } else {
            return null;
        }
    }
