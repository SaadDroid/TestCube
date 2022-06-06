@DELETE
  @Path("/data/modules")
  public void deleteModules(HttpRequest request, HttpResponder responder,
                            @PathParam("namespace-id") String namespaceId) throws Exception {
    typeService.deleteAll(new NamespaceId(namespaceId));
    responder.sendStatus(HttpResponseStatus.OK);
  }
