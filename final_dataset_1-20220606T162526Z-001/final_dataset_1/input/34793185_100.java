public List<ValidationMessage> validate(final Path resourcePath,
                                            final String content) {
        return validate(resourcePath,
                        content,
                        false);
    }
