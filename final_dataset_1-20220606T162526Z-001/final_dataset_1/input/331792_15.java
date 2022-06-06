@Override
  public void registerAlias(final String name, final String alias) {
    checkNotNull(name);
    checkNotNull(alias);

    log.debug("Registering alias: {} -> {}", name, alias);

    if (log.isDebugEnabled()) {
      if (containsAlias(name)) {
        log.debug("Replacing alias: {}", name);
      }
    }

    aliases.put(name, alias);

    events.publish(new AliasRegisteredEvent(name, alias));
  }
