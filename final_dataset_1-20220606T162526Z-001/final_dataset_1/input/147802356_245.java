@OpenApi(
      path = ROUTE,
      method = HttpMethod.POST,
      summary = "Submit a signed transaction to be imported.",
      tags = {TAG_VALIDATOR},
      requestBody =
          @OpenApiRequestBody(content = {@OpenApiContent(from = SignedBeaconBlock.class)}),
      description =
          "Submit a signed beacon block to the beacon node to be imported."
              + " The beacon node performs the required validation.",
      responses = {
        @OpenApiResponse(
            status = RES_OK,
            description = "Block has been successfully broadcast, validated and imported."),
        @OpenApiResponse(
            status = RES_ACCEPTED,
            description =
                "Block has been successfully broadcast, but failed validation and has not been imported."),
        @OpenApiResponse(status = RES_BAD_REQUEST, description = "Unable to parse request body."),
        @OpenApiResponse(
            status = RES_INTERNAL_ERROR,
            description = "Beacon node experienced an internal error."),
        @OpenApiResponse(
            status = RES_SERVICE_UNAVAILABLE,
            description = "Beacon node is currently syncing.")
      })
  @Override
  public void handle(final Context ctx) throws Exception {
    try {
      if (syncDataProvider.getSyncStatus().is_syncing) {
        ctx.status(SC_SERVICE_UNAVAILABLE);
        return;
      }

      final SignedBeaconBlock signedBeaconBlock =
          jsonProvider.jsonToObject(ctx.body(), SignedBeaconBlock.class);

      ctx.result(
          validatorDataProvider
              .submitSignedBlock(signedBeaconBlock)
              .thenApplyChecked(
                  validatorBlockResult -> handleResponseContext(ctx, validatorBlockResult)));

    } catch (final JsonMappingException | JsonParseException ex) {
      ctx.status(SC_BAD_REQUEST);
    } catch (final Exception ex) {
      ctx.status(SC_INTERNAL_SERVER_ERROR);
    }
  }
