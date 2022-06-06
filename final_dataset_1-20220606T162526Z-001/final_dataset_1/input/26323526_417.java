public Map<String, V> getVertexCache() {
    return new ImmutableMap.Builder<String, V>().putAll(vertexCache).build();
  }
