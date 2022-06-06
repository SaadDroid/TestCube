public URI getAbsolutePath() {
        String path = getAbsolutePathAsString();
        return URI.create(path);
    }
