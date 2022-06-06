@OpenApi(
      path = ROUTE,
      method = HttpMethod.GET,
      summary = "Get validators matching the specified query.",
      tags = {TAG_BEACON},
      description =
          "Returns validator information.\n\n"
              + "Returns the first page of validators in the current epoch if you do not specify any parameters.",
      queryParams = {
        @OpenApiParam(
            name = EPOCH,
            description = EPOCH_QUERY_DESCRIPTION + " Defaults to the current epoch."),
        @OpenApiParam(
            name = ACTIVE,
            description =
                "Only return validators that are active in the specified `epoch`. "
                    + "By default, returns inactive and active validators.\n\n"
                    + "**Note**: The field accepts any value to return active validators."),
        @OpenApiParam(
            name = PAGE_SIZE,
            type = Integer.class,
            description =
                "`Integer` The amount of results to return per page. Defaults to "
                    + PAGE_SIZE_DEFAULT
                    + " results."),
        @OpenApiParam(
            name = PAGE_TOKEN,
            type = Integer.class,
            description =
                "`Integer` Page number to return. Defaults to page " + PAGE_TOKEN_DEFAULT + ".")
      },
      responses = {
        @OpenApiResponse(
            status = RES_OK,
            content = @OpenApiContent(from = BeaconValidators.class),
            description = "List of validator objects."),
        @OpenApiResponse(status = RES_NO_CONTENT, description = NO_CONTENT_PRE_GENESIS),
        @OpenApiResponse(status = RES_INTERNAL_ERROR)
      })
  @Override
  public void handle(Context ctx) throws Exception {
    final Map<String, List<String>> parameters = ctx.queryParamMap();
    try {
      final boolean activeOnly = parameters.containsKey(ACTIVE);
      int pageSize =
          getPositiveIntegerValueWithDefaultIfNotSupplied(parameters, PAGE_SIZE, PAGE_SIZE_DEFAULT);
      int pageToken =
          getPositiveIntegerValueWithDefaultIfNotSupplied(
              parameters, PAGE_TOKEN, PAGE_TOKEN_DEFAULT);

      boolean isFinalized = false;
      final SafeFuture<Optional<BeaconState>> future;
      if (parameters.containsKey(EPOCH)) {
        UInt64 epoch = getParameterValueAsEpoch(parameters, EPOCH);
        UInt64 slot = BeaconStateUtil.compute_start_slot_at_epoch(epoch);
        isFinalized = chainDataProvider.isFinalized(slot);
        future = chainDataProvider.getStateAtSlot(slot);
      } else {
        Bytes32 blockRoot =
            chainDataProvider.getBestBlockRoot().orElseThrow(ChainDataUnavailableException::new);
        future = chainDataProvider.getStateByBlockRoot(blockRoot);
      }

      if (isFinalized) {
        this.handlePossiblyGoneResult(
            ctx, future, getResultProcessor(activeOnly, pageSize, pageToken));
      } else {
        this.handlePossiblyMissingResult(
            ctx, future, getResultProcessor(activeOnly, pageSize, pageToken));
      }
    } catch (final IllegalArgumentException e) {
      ctx.result(jsonProvider.objectToJSON(new BadRequest(e.getMessage())));
      ctx.status(SC_BAD_REQUEST);
    }
  }
