@GET
  @Path("/data/datasets/{name}/properties")
  public void getProperties(HttpRequest request, HttpResponder responder,
                            @PathParam("namespace-id") String namespaceId,
                            @PathParam("name") String name) throws Exception {
    logCallReceived(request);
    DatasetId instance = ConversionHelpers.toDatasetInstanceId(namespaceId, name);
    responder.sendJson(HttpResponseStatus.OK,
                       GSON.toJson(instanceService.getOriginalProperties(instance),
                                   new TypeToken<Map<String, String>>() { }.getType()));
    logCallResponded(request);
  }
