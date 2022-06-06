@GET
  @JSONP
  @Timed
  @Produces({MediaType.APPLICATION_JSON, "application/javascript"})
  @CacheControl(mustRevalidate = true, noCache = true, noStore = true)
  public Response fetch() {

    final Optional<Map<String, Rule>> rules;
    try {
      rules = store.fetch();
    } catch (NotificationStoreException e) {
      throw new NotificationException(
          Response.Status.INTERNAL_SERVER_ERROR, "Unable to fetch rules", e);
    }

    if (!rules.isPresent()) {
      throw new NotificationException(Response.Status.NOT_FOUND, "No rules found");
    }

    return Response.ok(rules.get()).build();
  }
