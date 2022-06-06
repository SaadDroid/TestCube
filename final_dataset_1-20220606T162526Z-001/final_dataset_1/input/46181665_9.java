public boolean match(Integer size, Integer decimalDigits) {
        if (size == null || decimalDigits == null) {
            return false;
        }

        return (columnSizeMin == null || size >= columnSizeMin) && (columnSizeMax == null || size < columnSizeMax)
                && (columnDecimalDigitsMin == null || decimalDigits >= columnDecimalDigitsMin)
                && (columnDecimalDigitsMax == null || decimalDigits < columnDecimalDigitsMax);
    }
