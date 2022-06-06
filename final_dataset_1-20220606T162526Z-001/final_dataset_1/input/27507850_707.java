@GET
  @Produces(MediaType.APPLICATION_OCTET_STREAM)
  @SuppressWarnings({"MustBeClosedChecker", "PMD.CloseResource"}) // Response eventually closes it.
  public @Nonnull Response get(@QueryParam(QP_KEY) String key) throws IOException {
    InputStream inputStream = Main.getWorkMgr().getNetworkObject(_network, key);
    if (inputStream == null) {
      return Response.status(Status.NOT_FOUND).build();
    }
    String filename = Paths.get(key).getFileName().toString();
    return Response.ok(inputStream, MediaType.APPLICATION_OCTET_STREAM)
        .header("Content-Disposition", "attachment; filename=\"" + filename + "\"")
        .header(CoordConsts.SVC_FILENAME_HDR, filename)
        .build();
  }
