@Override
  public void applyConfiguration(Object cf) throws JMSException {
    if (BooleanUtils
        .or(new boolean[] {cf instanceof ConnectionFactory, cf instanceof XAConnectionFactory})) {
      getProperties().stream().forEach((kvp) -> SimpleBeanUtil.callSetter(cf, "set" + kvp.getKey(), kvp.getValue()));
    } else {
      throw new JMSException("Object to apply configuration is not a XA/ConnectionFactory.");
    }
  }
