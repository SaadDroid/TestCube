@Override public IMetaStore getMetastore() {
    Repository repository = kettleRepositoryLocator.getRepository();
    if ( repository != null ) {
      return repository.getMetaStore();
    }
    return null;
  }
