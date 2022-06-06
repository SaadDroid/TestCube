public static IndexToIndexMultiMap buildIndexToIndexMultiMap(
            @NotNull final Collection<? extends Collection<Integer>> valueToDocuments,
            final int documentsCount) {
        final int uniqueValuesCount = valueToDocuments.size();
        if (uniqueValuesCount == 0)
            throw new IllegalArgumentException("Nonpositive values count");
        if (documentsCount <= 0)
            throw new IllegalArgumentException("Nonpositive documents count");

        /**
         * If all of the documents have exactly one value we can use {@link AscendingBitSetIndexToIndexMultiMap}
         */
        if (hasDocumentsWithMultipleKeys(valueToDocuments, documentsCount)) {
            if (((long) uniqueValuesCount) * documentsCount / Long.SIZE <
                    documentsCount * Integer.BYTES) {
                // BitSet might be more effective
                return buildIndexToIndexMultiMap(
                        V1DatabaseFormat.MultiMapType.LONG_ARRAY_BIT_SET_BASED,
                        valueToDocuments,
                        documentsCount);
            } else {
                return buildIndexToIndexMultiMap(
                        V1DatabaseFormat.MultiMapType.LIST_BASED,
                        valueToDocuments,
                        documentsCount);
            }
        } else {
            return new AscendingBitSetIndexToIndexMultiMap(valueToDocuments, documentsCount);
        }
    }
