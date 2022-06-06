@Override
  public IMetaStore getExplicitMetastore( String providerKey ) {
    MetastoreProvider provider = super.getItem( providerKey );
    return provider == null ? null : provider.getMetastore();
  }
