public Map<String, T> getNodes() {
        return Maps.transformValues(Collections.unmodifiableMap(_nodes), input -> (input != null) ? input.orElse(null) : null);
    }
