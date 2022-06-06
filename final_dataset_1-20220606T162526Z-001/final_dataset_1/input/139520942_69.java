@Override
    public String toString() {
        return Numeric.toHexStringWithPrefixZeroPadded(
                value.getValue(), LENGTH_IN_HEX);
    }
