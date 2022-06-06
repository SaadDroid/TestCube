@Override
    public Long convert(String toBeConverted) throws ConversionException {
        if (toBeConverted == null || toBeConverted.isEmpty()) {
            return null;
        }
        try {
            return Long.parseLong(toBeConverted);
        } catch (NumberFormatException e) {
            throw new ConversionException(toBeConverted + " cannot be converted to Long", e);
        }
    }
