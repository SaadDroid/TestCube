@POST
  @Path("legalentities")
  public Response add(@Context UriInfo uriInfo, LegalEntityDocument request) {
    LegalEntityDocument result = getLegalEntityMaster().add(request);
    URI createdUri = (new com.opengamma.master.legalentity.impl.DataLegalEntityResource()).uriVersion(uriInfo.getBaseUri(), result.getUniqueId());
    return responseCreatedObject(createdUri, result);
  }
