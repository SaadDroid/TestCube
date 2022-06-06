@POST
  @Path("securities")
  public Response add(@Context UriInfo uriInfo, SecurityDocument request) {
    SecurityDocument result = getSecurityMaster().add(request);
    URI createdUri = (new DataSecurityResource()).uriVersion(uriInfo.getBaseUri(), result.getUniqueId());
    return responseCreatedObject(createdUri, result);
  }
