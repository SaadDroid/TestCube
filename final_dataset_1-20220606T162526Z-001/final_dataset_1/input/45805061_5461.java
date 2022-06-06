@POST
  public Response update(@Context UriInfo uriInfo, PortfolioDocument request) {
    return super.update(uriInfo, request);
  }
