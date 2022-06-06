@OpenApi(
      path = ROUTE,
      method = HttpMethod.GET,
      summary = "Aggregates all attestations matching given attestation data root and slot.",
      tags = {TAG_VALIDATOR},
      queryParams = {
        @OpenApiParam(
            name = ATTESTATION_DATA_ROOT,
            description =
                "`String` HashTreeRoot of AttestationData that validator wants aggregated.",
            required = true),
        @OpenApiParam(
            name = SLOT,
            description = "`uint64` Non-finalized slot for which to create the aggregation.",
            required = true)
      },
      description = "Aggregates all attestations matching given attestation data root and slot.",
      responses = {
        @OpenApiResponse(
            status = RES_OK,
            content = @OpenApiContent(from = Attestation.class, isArray = true),
            description =
                "Returns aggregated `Attestation` object with same `AttestationData` root."),
        @OpenApiResponse(status = RES_BAD_REQUEST, description = "Invalid parameter supplied"),
        @OpenApiResponse(
            status = RES_FORBIDDEN,
            description = "Beacon node was not assigned to aggregate on that subnet"),
        @OpenApiResponse(status = RES_INTERNAL_ERROR, description = "Beacon node internal error.")
      })
  @Override
  public void handle(Context ctx) throws Exception {

    try {
      final Map<String, List<String>> parameters = ctx.queryParamMap();
      if (parameters.size() < 2) {
        throw new IllegalArgumentException(
            String.format("Please specify both %s and %s", ATTESTATION_DATA_ROOT, SLOT));
      }
      Bytes32 beacon_block_root = getParameterValueAsBytes32(parameters, ATTESTATION_DATA_ROOT);
      // Teku isn't using this parameter at the moment. We are enforcing it to stay compatible with
      // the standard api
      getParameterValueAsUInt64(parameters, SLOT);

      ctx.result(
          provider
              .createAggregate(beacon_block_root)
              .thenApplyChecked(optionalAttestation -> serializeResult(ctx, optionalAttestation))
              .exceptionallyCompose(error -> handleError(ctx, error)));
    } catch (final IllegalArgumentException e) {
      ctx.result(jsonProvider.objectToJSON(new BadRequest(e.getMessage())));
      ctx.status(SC_BAD_REQUEST);
    }
  }
