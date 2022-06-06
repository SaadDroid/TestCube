public void removePropsWithPrefix(String prefix) {
    this.specProperties.entrySet().removeIf(entry -> ((String) entry.getKey()).startsWith(prefix));

    Properties newCommonProperties = null;
    for (Object key: this.commonProperties.keySet()) {
      if (((String)key).startsWith(prefix)) {
        if (newCommonProperties == null) {
          newCommonProperties = new Properties();
          newCommonProperties.putAll(this.commonProperties);
        }
        newCommonProperties.remove(key);
      }
    }

    if (newCommonProperties != null) {
      this.commonProperties = newCommonProperties;
    }
  }
