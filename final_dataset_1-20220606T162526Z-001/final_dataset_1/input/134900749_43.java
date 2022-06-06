@Override
    public StringBuilder exportOneScope(MetricRegistry.Type scope) {
        alreadyExportedNames.set(new HashSet<>());
        StringBuilder sb = new StringBuilder();
        getEntriesForScope(scope, sb);
        alreadyExportedNames.set(null);
        return sb;
    }
