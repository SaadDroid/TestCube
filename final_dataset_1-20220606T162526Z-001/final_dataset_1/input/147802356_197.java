@OpenApi(
      path = ROUTE,
      method = HttpMethod.GET,
      summary = "Get the beacon chain state root for the specified slot.",
      tags = {TAG_BEACON},
      queryParams = {@OpenApiParam(name = SLOT, description = SLOT_QUERY_DESCRIPTION)},
      description = "Returns the beacon chain state root for the specified slot.",
      responses = {
        @OpenApiResponse(
            status = RES_OK,
            content = @OpenApiContent(from = String.class),
            description = "The beacon chain `state_root`(`Bytes32`) for the specified slot."),
        @OpenApiResponse(
            status = RES_NOT_FOUND,
            description = "The beacon state root matching the supplied parameter was not found."),
        @OpenApiResponse(status = RES_BAD_REQUEST, description = "Missing a query parameter."),
        @OpenApiResponse(status = RES_NO_CONTENT, description = NO_CONTENT_PRE_GENESIS),
        @OpenApiResponse(status = RES_INTERNAL_ERROR)
      })
  @Override
  public void handle(Context ctx) throws Exception {
    try {
      final Map<String, List<String>> parameters = ctx.queryParamMap();
      SafeFuture<Optional<Bytes32>> future = null;
      if (parameters.size() == 0) {
        throw new IllegalArgumentException("No query parameters specified");
      }

      if (parameters.containsKey(SLOT)) {
        UInt64 slot = getParameterValueAsUInt64(parameters, SLOT);
        future = queryBySlot(slot);
        ctx.result(
            future.thenApplyChecked(
                hashTreeRoot -> {
                  if (hashTreeRoot.isEmpty()) {
                    ctx.status(SC_NOT_FOUND);
                    return null;
                  }
                  ctx.header(Header.CACHE_CONTROL, getMaxAgeForSlot(provider, slot));
                  return jsonProvider.objectToJSON(hashTreeRoot.get());
                }));
      } else {
        throw new IllegalArgumentException(SLOT + " parameter was not specified.");
      }
    } catch (final IllegalArgumentException e) {
      ctx.result(jsonProvider.objectToJSON(new BadRequest(e.getMessage())));
      ctx.status(SC_BAD_REQUEST);
    }
  }
