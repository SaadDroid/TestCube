public PropertyValue remove(String key) {
    Objects.requireNonNull(key);
    return properties.remove(key);
  }
