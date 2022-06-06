public PropertyList deepCopy(boolean keepId) {
        PropertyList copy = new PropertyList(this, keepId);

        for (Property property : list) {
            copy.add(property.deepCopy(false));
        }

        return copy;
    }
