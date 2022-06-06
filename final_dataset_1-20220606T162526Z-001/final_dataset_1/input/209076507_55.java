@Override
    public String format(Part part) {
        Validate.notNull(part, "Part is null");

        Function<Part, String> function = FORMAT_FUNCTIONS.get(part.getClass());
        if (function == null) {
            throw new RuntimeException(
                    String.format("No HTML format function found for part '%s'", part));
        }

        return function.apply(part);
    }
