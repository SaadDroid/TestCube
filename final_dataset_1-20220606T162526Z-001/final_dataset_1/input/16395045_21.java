@GET
  @Produces({MIMETYPE_XML, MIMETYPE_JSON, MIMETYPE_PROTOBUF,
    MIMETYPE_PROTOBUF_IETF})
  public Response get(final @Context UriInfo uriInfo) {
    MultivaluedMap<String, String> params = uriInfo.getQueryParameters();

    servlet.getMetrics().incrementRequests(1);
    try {
      CellSetModel model = new CellSetModel();
      for (String rk : params.get(ROW_KEYS_PARAM_NAME)) {
        RowSpec rowSpec = new RowSpec(rk);

        if (this.versions != null) {
          rowSpec.setMaxVersions(this.versions);
        }

        ResultGenerator generator =
          ResultGenerator.fromRowSpec(this.tableResource.getName(), rowSpec, null);
        if (!generator.hasNext()) {
          return Response.status(Response.Status.NOT_FOUND)
            .type(MIMETYPE_TEXT).entity("Not found" + CRLF)
            .build();
        }

        Cell value = null;
        RowModel rowModel = new RowModel(rk);

        while ((value = generator.next()) != null) {
          rowModel.addCell(new CellModel(CellUtil.cloneFamily(value),
              CellUtil.cloneQualifier(value),
            value.getTimestamp(), CellUtil.cloneValue(value)));
        }

        model.addRow(rowModel);
      }
      servlet.getMetrics().incrementSucessfulGetRequests(1);
      return Response.ok(model).build();
    } catch (IOException e) {
      servlet.getMetrics().incrementFailedGetRequests(1);
      return Response.status(Response.Status.SERVICE_UNAVAILABLE)
        .type(MIMETYPE_TEXT).entity("Unavailable" + CRLF)
        .build();
    }

  }
