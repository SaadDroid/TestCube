@Override
  public SecureStoreData get(String namespace, String name) throws Exception {
    validate(namespace);
    try {
      Secret secret = secretManager.get(namespace, name);
      SecretMetadata metadata = secret.getMetadata();
      return new SecureStoreData(new SecureStoreMetadata(metadata.getName(), metadata.getDescription(),
                                                         metadata.getCreationTimeMs(), metadata.getProperties()),
                                 secret.getData());
    } catch (SecretNotFoundException e) {
      throw new SecureKeyNotFoundException(new SecureKeyId(namespace, name), e);
    }
  }
