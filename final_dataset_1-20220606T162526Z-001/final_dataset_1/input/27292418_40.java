@Override
    public Scope enterScope(List<Import> imports) {
        ImportScope scope = new ImportScope(this, new DefaultTypeScope(symbolGenerator, resolver), resolver, symbolGenerator, moduleName, ImmutableList.<Import>builder()
            .add(moduleImport(NULL_SOURCE, "scotch.lang"))
            .addAll(imports)
            .build());
        importScopes.add(scope);
        return scope;
    }
