@NotNull
    public static TermCondition in(
            @NotNull
            final String fieldName,
            @NotNull
            final UnsignedByteArray... values) {
        return new SimpleMultiEqualityCondition(fieldName, values);
    }
