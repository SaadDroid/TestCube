public Collection<String> getPropertyKeys() {
        Collection<String> propertyKeys = new TreeSet<>(resourceComparator);

        for (String p : vertex.getPropertyKeys()) {
            String cleanName = propertyMapper.toCleanName(p, vertexType);
            if (! removedProperties.contains(cleanName)) {
                propertyKeys.add(cleanName);
            }
        }
        return propertyKeys;
    }
