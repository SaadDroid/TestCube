@GET
  @Path("nodes/{nodeId}")
  public Response getNode(
      @PathParam("nodeId") String idStr,
      @QueryParam("version") String version,
      @QueryParam("versionAsOf") String versionAsOf,
      @QueryParam("correctedTo") String correctedTo) {
    final ObjectId objectId = ObjectId.parse(idStr);
    final VersionCorrection vc = VersionCorrection.parse(versionAsOf, correctedTo);
    final PortfolioNode result = getPositionSource().getPortfolioNode(objectId.atVersion(version), vc);
    return responseOkObject(result);
  }
