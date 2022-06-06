@OpenApi(
      path = ROUTE,
      method = HttpMethod.GET,
      summary = "Get the beacon chain state matching the criteria.",
      tags = {TAG_BEACON},
      queryParams = {
        @OpenApiParam(name = ROOT, description = ROOT_QUERY_DESCRIPTION),
        @OpenApiParam(name = SLOT, description = SLOT_QUERY_DESCRIPTION),
        @OpenApiParam(name = STATE_ROOT, description = STATE_ROOT_QUERY_DESCRIPTION)
      },
      description = "Returns the beacon chain state that matches the specified slot or root.",
      responses = {
        @OpenApiResponse(status = RES_OK, content = @OpenApiContent(from = BeaconState.class)),
        @OpenApiResponse(
            status = RES_NOT_FOUND,
            description = "The beacon state matching the supplied query parameter was not found."),
        @OpenApiResponse(status = RES_BAD_REQUEST, description = "Missing a query parameter"),
        @OpenApiResponse(status = RES_NO_CONTENT, description = NO_CONTENT_PRE_GENESIS),
        @OpenApiResponse(status = RES_INTERNAL_ERROR)
      })
  @Override
  public void handle(Context ctx) throws Exception {
    try {
      final Map<String, List<String>> parameters = ctx.queryParamMap();
      final SafeFuture<Optional<BeaconState>> future;
      if (parameters.size() == 0) {
        throw new IllegalArgumentException("No query parameters specified");
      }

      boolean isFinalizedState = false;
      if (parameters.containsKey(ROOT)) {
        future = provider.getStateByBlockRoot(getParameterValueAsBytes32(parameters, ROOT));
      } else if (parameters.containsKey(SLOT)) {
        final UInt64 slot = getParameterValueAsUInt64(parameters, SLOT);
        future = provider.getStateAtSlot(getParameterValueAsUInt64(parameters, SLOT));
        isFinalizedState = provider.isFinalized(slot);
      } else if (parameters.containsKey(STATE_ROOT)) {
        future = provider.getStateByStateRoot(getParameterValueAsBytes32(parameters, STATE_ROOT));
      } else {
        ctx.result(
            jsonProvider.objectToJSON(
                new BadRequest("expected one of " + SLOT + ", " + ROOT + ", or " + STATE_ROOT)));
        ctx.status(SC_BAD_REQUEST);
        return;
      }
      if (isFinalizedState) {
        this.handlePossiblyGoneResult(ctx, future, this::handleResult);
      } else {
        this.handlePossiblyMissingResult(ctx, future, this::handleResult);
      }
    } catch (final IllegalArgumentException e) {
      ctx.result(jsonProvider.objectToJSON(new BadRequest(e.getMessage())));
      ctx.status(SC_BAD_REQUEST);
    }
  }
