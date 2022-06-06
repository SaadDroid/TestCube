@POST
  public Response update(@Context UriInfo uriInfo, MarketDataSnapshotDocument request) {
    return super.update(uriInfo, request);
  }
