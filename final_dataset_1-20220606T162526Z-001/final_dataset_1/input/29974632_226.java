@Override
    public Path getParent() {
        final List<String> normalizedPath = normalizeModel(pathElements);
        if(normalizedPath.isEmpty()) {
            return null;
        } else {
            final List<String> subPath = normalizedPath.subList(0, normalizedPath.size() - 1);
            return new InMemoryPath(subPath);
        }
    }
