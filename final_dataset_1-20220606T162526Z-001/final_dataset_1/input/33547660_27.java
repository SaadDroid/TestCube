public synchronized void resolve(Identifier id, Input input) throws IOException, ResolverException {
    if (input.isResolved())
      return;
    if (hadCatalogError)
      return;
    String absoluteUri = null;
    try {
      absoluteUri = BasicResolver.resolveUri(id);
      if (id.getUriReference().equals(absoluteUri))
        absoluteUri = null;
    }
    catch (ResolverException e) {
      // ignore
    }
    String resolved = null;
    boolean isExternalIdentifier = (id instanceof ExternalIdentifier);
    try {
      if (!catalogLoaded) {
        catalogLoaded = true;
        catalog.loadSystemCatalogs();
      }
      if (absoluteUri != null)
        resolved = isExternalIdentifier ? catalog.resolveSystem(absoluteUri) : catalog.resolveURI(absoluteUri);
      if (resolved == null) {
        if (!isExternalIdentifier)
          resolved = catalog.resolveURI(id.getUriReference());
        else if (id instanceof ExternalEntityIdentifier) {
          ExternalEntityIdentifier xid = (ExternalEntityIdentifier)id;
          resolved = catalog.resolveEntity(xid.getEntityName(), xid.getPublicId(), xid.getUriReference());
        }
        else if (id instanceof ExternalDTDSubsetIdentifier) {
          ExternalDTDSubsetIdentifier xid = (ExternalDTDSubsetIdentifier)id;
          resolved = catalog.resolveDoctype(xid.getDoctypeName(), xid.getPublicId(), xid.getUriReference());
        }
        else {
          ExternalIdentifier xid = (ExternalIdentifier)id;
          resolved = catalog.resolvePublic(xid.getPublicId(), xid.getUriReference());
        }
      }
    }
    catch (ResolverIOException e) {
      hadCatalogError = true;
      throw e.getResolverException();
    }
    if (resolved != null)
      input.setUri(resolved);
  }
