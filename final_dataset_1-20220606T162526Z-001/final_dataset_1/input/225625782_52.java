public void configure(Map<String, String> conf, Binder binder) {
    try {
      ENTITIES.forEach(jsonEntity -> jsonEntity.bind(binder, moduleSpecNode, formatVersion));
    } catch (Throwable t) {
      throw new ModuleConfigurationException(
          format("Error while parsing module at %s", moduleUrl), t);
    }
  }
