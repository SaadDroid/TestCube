@DELETE
  public @Nonnull Response delete(@QueryParam(QP_KEY) String key) throws IOException {
    if (Main.getWorkMgr().deleteNetworkObject(_network, key)) {
      return Response.ok().build();
    } else {
      return Response.status(Status.NOT_FOUND).build();
    }
  }
