@OpenApi(
      path = ROUTE,
      method = HttpMethod.GET,
      summary = "Get the beacon chain block matching the criteria.",
      tags = {TAG_BEACON},
      queryParams = {
        @OpenApiParam(name = EPOCH, description = EPOCH_QUERY_DESCRIPTION),
        @OpenApiParam(name = SLOT, description = SLOT_QUERY_DESCRIPTION),
        @OpenApiParam(name = ROOT, description = ROOT_QUERY_DESCRIPTION)
      },
      description =
          "Returns the beacon chain block that matches the specified epoch, slot, or block root.",
      responses = {
        @OpenApiResponse(status = RES_OK, content = @OpenApiContent(from = GetBlockResponse.class)),
        @OpenApiResponse(status = RES_BAD_REQUEST, description = "Invalid parameter supplied"),
        @OpenApiResponse(status = RES_NOT_FOUND, description = "Specified block not found")
      })
  @Override
  public void handle(final Context ctx) throws Exception {
    try {
      final Map<String, List<String>> queryParamMap = ctx.queryParamMap();
      if (queryParamMap.size() < 1) {
        throw new IllegalArgumentException(NO_PARAMETERS);
      } else if (queryParamMap.size() > 1) {
        throw new IllegalArgumentException(TOO_MANY_PARAMETERS);
      }

      if (queryParamMap.containsKey(ROOT)) {
        final Bytes32 blockRoot = getParameterValueAsBytes32(queryParamMap, ROOT);

        ctx.result(
            provider
                .getBlockByBlockRoot(blockRoot)
                .thenApplyChecked(block -> handleResponseContext(ctx, block)));
        return;
      }

      final UInt64 slot;
      if (queryParamMap.containsKey(EPOCH)) {
        UInt64 epoch = getParameterValueAsEpoch(queryParamMap, EPOCH);
        slot = compute_start_slot_at_epoch(epoch);
      } else if (queryParamMap.containsKey(SLOT)) {
        slot = getParameterValueAsUInt64(queryParamMap, SLOT);
      } else {
        throw new IllegalArgumentException(NO_VALID_PARAMETER);
      }

      ctx.result(
          provider
              .getBlockBySlot(slot)
              .thenApplyChecked(block -> handleResponseContext(ctx, block)));

    } catch (final IllegalArgumentException e) {
      ctx.status(SC_BAD_REQUEST);
      ctx.result(jsonProvider.objectToJSON(new BadRequest(e.getMessage())));
    }
  }
