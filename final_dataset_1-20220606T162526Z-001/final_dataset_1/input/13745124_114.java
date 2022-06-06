@SuppressWarnings("unchecked")
  @NullableDecl
  public <V extends FileAttributeView> V getFileAttributeView(FileLookup lookup, Class<V> type) {
    AttributeProvider provider = providersByViewType.get(type);

    if (provider != null) {
      return (V) provider.view(lookup, createInheritedViews(lookup, provider));
    }

    return null;
  }
