@OpenApi(
      path = ROUTE,
      method = HttpMethod.GET,
      summary = "Create and return an unsigned beacon block at the specified slot.",
      tags = {TAG_VALIDATOR},
      queryParams = {
        @OpenApiParam(
            name = SLOT,
            description = "`uint64` Slot in which to create the beacon block.",
            required = true),
        @OpenApiParam(
            name = RANDAO_REVEAL,
            description = "`BLSSignature Hex` BLS12-381 signature for the current epoch.",
            required = true),
        @OpenApiParam(name = GRAFFITI, description = "`Bytes32 Hex` Graffiti.")
      },
      description =
          "Create and return an unsigned beacon block at the specified slot. "
              + "The `randao_reveal` and `slot` must be provided to create the block.",
      responses = {
        @OpenApiResponse(
            status = RES_OK,
            content = @OpenApiContent(from = BeaconBlock.class),
            description = "`BeaconBlock` object for the specified slot."),
        @OpenApiResponse(status = RES_NO_CONTENT, description = NO_CONTENT_PRE_GENESIS),
        @OpenApiResponse(status = RES_BAD_REQUEST, description = "Invalid parameter supplied")
      })
  @Override
  public void handle(@NotNull Context ctx) throws Exception {
    try {
      final Map<String, List<String>> queryParamMap = ctx.queryParamMap();
      BLSSignature randao = getParameterValueAsBLSSignature(queryParamMap, RANDAO_REVEAL);
      UInt64 slot = getParameterValueAsUInt64(queryParamMap, SLOT);
      Optional<Bytes32> graffiti = getOptionalParameterValueAsBytes32(queryParamMap, GRAFFITI);
      ctx.result(
          provider
              .getUnsignedBeaconBlockAtSlot(slot, randao, graffiti)
              .thenApplyChecked(
                  maybeBlock -> {
                    if (maybeBlock.isEmpty()) {
                      throw new ChainDataUnavailableException();
                    }
                    return jsonProvider.objectToJSON(maybeBlock.get());
                  })
              .exceptionallyCompose(error -> handleError(ctx, error)));
    } catch (final IllegalArgumentException e) {
      ctx.status(SC_BAD_REQUEST);
      ctx.result(jsonProvider.objectToJSON(new BadRequest(e.getMessage())));
    }
  }
