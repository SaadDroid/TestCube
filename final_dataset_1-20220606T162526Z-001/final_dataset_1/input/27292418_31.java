@Override
    public Scope enterScope(String moduleName) {
        Scope scope = new ModuleScope(this, new DefaultTypeScope(symbolGenerator, resolver), resolver, symbolGenerator, moduleName);
        children.put(moduleName, scope);
        return scope;
    }
