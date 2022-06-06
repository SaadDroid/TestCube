@Override
    public final boolean commonName(Location other) {
        Validate.notNull(other, "other must not be null");
        Set<String> names1 = this.collectAlternativeNames();
        Set<String> names2 = other.collectAlternativeNames();
        names1.retainAll(names2);
        return names1.size() > 0;
    }
