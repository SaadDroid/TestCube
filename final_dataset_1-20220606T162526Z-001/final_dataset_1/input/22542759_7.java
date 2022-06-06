@Override
  public void delete(String namespace, String name) throws Exception {
    checkNamespaceExists(namespace);
    String keyName = getKeyName(namespace, name);
    Key key = null;
    writeLock.lock();
    try {
      if (!keyStore.containsAlias(keyName)) {
        throw new NotFoundException(new SecureKeyId(namespace, name));
      }
      key = deleteFromStore(keyName, password);
      flush();
      LOG.debug(String.format("Successfully deleted key %s from namespace %s", name, namespace));
    } catch (UnrecoverableKeyException | NoSuchAlgorithmException | KeyStoreException e) {
      throw new IOException("Failed to delete the key. ", e);
    } catch (IOException ioe) {
      try {
        keyStore.setKeyEntry(keyName, key, password, null);
      } catch (KeyStoreException e) {
        ioe.addSuppressed(e);
      }
      throw ioe;
    } finally {
      writeLock.unlock();
    }
  }
