@GET
  @Path("samplingfrequencies")
  @Produces(MediaType.APPLICATION_JSON)
  public String getSamplingFrequencies() {
    return convertToJsonArray(SamplingFrequency.class, Arrays.asList(SamplingFrequency.values()).iterator());
  }
