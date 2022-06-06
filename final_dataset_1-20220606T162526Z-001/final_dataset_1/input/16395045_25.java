@DELETE
  public Response delete(final @Context UriInfo uriInfo) {
    if (LOG.isDebugEnabled()) {
      LOG.debug("DELETE " + uriInfo.getAbsolutePath());
    }
    servlet.getMetrics().incrementRequests(1);
    if (servlet.isReadOnly()) {
      return Response.status(Response.Status.FORBIDDEN)
        .type(MIMETYPE_TEXT).entity("Forbidden" + CRLF)
        .build();
    }
    Delete delete = null;
    if (rowspec.hasTimestamp())
      delete = new Delete(rowspec.getRow(), rowspec.getTimestamp());
    else
      delete = new Delete(rowspec.getRow());

    for (byte[] column: rowspec.getColumns()) {
      byte[][] split = KeyValue.parseColumn(column);
      if (rowspec.hasTimestamp()) {
        if (split.length == 1) {
          delete.deleteFamily(split[0], rowspec.getTimestamp());
        } else if (split.length == 2) {
          delete.deleteColumns(split[0], split[1], rowspec.getTimestamp());
        } else {
          return Response.status(Response.Status.BAD_REQUEST)
            .type(MIMETYPE_TEXT).entity("Bad request" + CRLF)
            .build();
        }
      } else {
        if (split.length == 1) {
          delete.deleteFamily(split[0]);
        } else if (split.length == 2) {
          delete.deleteColumns(split[0], split[1]);
        } else {
          return Response.status(Response.Status.BAD_REQUEST)
            .type(MIMETYPE_TEXT).entity("Bad request" + CRLF)
            .build();
        }
      }
    }
    HTableInterface table = null;
    try {
      table = servlet.getTable(tableResource.getName());
      table.delete(delete);
      servlet.getMetrics().incrementSucessfulDeleteRequests(1);
      if (LOG.isDebugEnabled()) {
        LOG.debug("DELETE " + delete.toString());
      }
    } catch (IOException e) {
      servlet.getMetrics().incrementFailedDeleteRequests(1);
      return Response.status(Response.Status.SERVICE_UNAVAILABLE)
        .type(MIMETYPE_TEXT).entity("Unavailable" + CRLF)
        .build();
    } finally {
      if (table != null) try {
        table.close();
      } catch (IOException ioe) { }
    }
    return Response.ok().build();
  }
