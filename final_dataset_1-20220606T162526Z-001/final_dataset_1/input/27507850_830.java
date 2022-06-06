@GET
  @Path(CoordConstsV2.RSC_CONTAINER)
  @Deprecated
  public Response redirectContainer() {
    return redirectNetwork();
  }
