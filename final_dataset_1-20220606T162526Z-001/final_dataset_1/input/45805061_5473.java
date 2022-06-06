@POST
  @Path("regions")
  public Response add(@Context UriInfo uriInfo, RegionDocument request) {
    RegionDocument result = getRegionMaster().add(request);
    URI createdUri = (new DataRegionResource()).uriVersion(uriInfo.getBaseUri(), result.getUniqueId());
    return responseCreatedObject(createdUri, result);
  }
