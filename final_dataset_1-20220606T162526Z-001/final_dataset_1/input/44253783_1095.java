@Override
  public SerializableMessage applyService(String xml, SerializableMessage serializedMsg) throws CoreException {
    return applyService(xml, serializedMsg, true);
  }
