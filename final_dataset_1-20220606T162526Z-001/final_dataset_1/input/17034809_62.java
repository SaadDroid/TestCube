@Override
    public String[] transform(final InputRow inputRow) {
        String subtractedString = inputRow.getValue(baseColumn);
        for (final InputColumn<?> inputColumn : substringColumns) {
            final Object value = inputRow.getValue(inputColumn);
            if (value instanceof List) {
                for (final Object element : (List<?>) value) {
                    subtractedString = subtract(subtractedString, element);
                }
            } else {
                subtractedString = subtract(subtractedString, value);
            }
        }

        return new String[] { subtractedString };
    }
