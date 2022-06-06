public boolean isRelationProperty() {
        return loadedFor != null && loadedFor == Origin.RELATION || loadedFor == Origin.TYPE_REL;
    }
