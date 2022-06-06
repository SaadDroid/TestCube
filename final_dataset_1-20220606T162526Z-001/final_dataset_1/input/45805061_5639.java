@GET
  @Produces(MediaType.APPLICATION_JSON)
  public String getJSON() {
    FlexiBean out = createRootData();
    return getFreemarker().build(JSON_DIR + "position.ftl", out);
  }
