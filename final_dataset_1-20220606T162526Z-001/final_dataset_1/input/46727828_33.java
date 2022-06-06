BoltDeclarer buildBoltDeclarer(TopologyBuilder builder,
                                 StormParallelismConfig stormParallelismConfig,
                                 String boltId,
                                 IComponent baseComponent) throws ConfigurationException {

    if (baseComponent instanceof IBasicBolt) {
      return builder
          .setBolt(boltId, (IBasicBolt) baseComponent, stormParallelismConfig.getParallelismHint())
          .setNumTasks(stormParallelismConfig.getNumTasks());
    } else if (baseComponent instanceof IRichBolt) {
      return builder
          .setBolt(boltId, (IRichBolt) baseComponent, stormParallelismConfig.getParallelismHint())
          .setNumTasks(stormParallelismConfig.getNumTasks());
    } else {
      throw new ConfigurationException("Unknown component type: " + baseComponent.getClass());
    }
  }
