@Override
  public Exchange getSingle(final ExternalId identifier) {
    final Exchange result = getUnderlying().getSingle(identifier);
    cacheItem(result);
    return result;
  }
