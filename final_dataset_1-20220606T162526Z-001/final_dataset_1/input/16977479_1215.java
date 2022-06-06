public Set<String> getNameBindings() {
        if (parent == null) {
            return nameBindings;
        }
        return parent.getNameBindings();
    }
