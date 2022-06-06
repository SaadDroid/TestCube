@DELETE
  public Response delete(@QueryParam(QP_KEY) String key) throws IOException {
    if (Main.getWorkMgr().deleteSnapshotObject(_network, _snapshot, key)) {
      return Response.ok().build();
    } else {
      return Response.status(Status.NOT_FOUND).build();
    }
  }
