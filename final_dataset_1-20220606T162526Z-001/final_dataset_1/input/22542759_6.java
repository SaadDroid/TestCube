@Override
  public SecureStoreData get(String namespace, String name) throws Exception {
    checkNamespaceExists(namespace);
    String keyName = getKeyName(namespace, name);
    readLock.lock();
    try {
      if (!keyStore.containsAlias(keyName)) {
        throw new NotFoundException(name + " not found in the secure store.");
      }
      Key key = keyStore.getKey(keyName, password);
      return deserialize(key.getEncoded());
    } catch (NoSuchAlgorithmException | UnrecoverableKeyException | KeyStoreException e) {
      throw new IOException("Unable to retrieve the key " + name, e);
    } finally {
      readLock.unlock();
    }
  }
