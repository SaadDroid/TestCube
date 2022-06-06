@GET
  @Path("barriertypes")
  @Produces(MediaType.APPLICATION_JSON)
  public String getBarrierTypes() {
    return convertToJsonArray(BarrierType.class, Arrays.asList(BarrierType.values()).iterator());
  }
