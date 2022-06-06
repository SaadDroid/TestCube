@Override
    public void put(final String reference, final Object value) {
        requireNonNull(reference, "field reference is required");
        if (reference.isEmpty()) {
            throw new IllegalArgumentException("field reference is required");
        }
        final int index = reference.indexOf(".");
        if (index > -1) {
            final String referencePart = reference.substring(0, index);
            final boolean hasNestedField = index + 1 < reference.length();
            if (!hasNestedField) {
                throw new IllegalArgumentException("nested field reference is required");
            }
            final Object nestedField = get(referencePart);
            final Tuple<String> selectionAsTuple = nestedField instanceof Tuple ? ((Tuple) nestedField) : new ReflectiveTuple(nestedField);
            final String subReference = reference.substring(index + 1, reference.length());
            selectionAsTuple.put(subReference, value);
        } else {
            try {
                invokeMethodPut(record, reference, value);
            } catch (final IllegalAccessException | NoSuchMethodException | InvocationTargetException ignored) {
                try {
                    invokeFieldPut(record, reference, value);
                } catch (final IllegalAccessException | NoSuchFieldException ignore) {
                    throw new RuntimeException(String.format(SELECTION_S_DOES_NOT_EXIST, reference));
                }
            }
        }
    }
