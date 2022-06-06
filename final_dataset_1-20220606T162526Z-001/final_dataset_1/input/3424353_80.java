@Override
  public Map<String, Object> getContext(String key) {
    ContextEntry entry = getOrCreateContextEntry(key);
    return entry.getContext();
  }
