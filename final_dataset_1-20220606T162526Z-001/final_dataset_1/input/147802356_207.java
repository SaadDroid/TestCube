@OpenApi(
      path = ROUTE,
      method = HttpMethod.POST,
      summary = "Get validators matching specified public keys.",
      tags = {TAG_BEACON},
      description =
          "Returns information about validators that match the list of validator public keys and optional epoch.\n\n"
              + "If no epoch is specified, the validators are queried from the current state.\n\n"
              + "Public keys that do not match a validator are returned without validator information.",
      requestBody =
          @OpenApiRequestBody(
              content = {@OpenApiContent(from = ValidatorsRequest.class)},
              description =
                  "```\n{\n  \"epoch\": (uint64),\n  \"pubkeys\": [(Bytes48 as Hex String)]\n}\n```"),
      responses = {
        @OpenApiResponse(
            status = RES_OK,
            content = @OpenApiContent(from = ValidatorWithIndex.class, isArray = true),
            description = "List of validator objects."),
        @OpenApiResponse(status = RES_NO_CONTENT, description = NO_CONTENT_PRE_GENESIS),
        @OpenApiResponse(status = RES_BAD_REQUEST, description = "Invalid body supplied"),
        @OpenApiResponse(status = RES_INTERNAL_ERROR)
      })
  @Override
  public void handle(Context ctx) throws Exception {
    try {
      ValidatorsRequest request = jsonProvider.jsonToObject(ctx.body(), ValidatorsRequest.class);
      final SafeFuture<Optional<BeaconValidators>> validatorsFuture =
          chainDataProvider.getValidatorsByValidatorsRequest(request);

      if (request.epoch != null && chainDataProvider.isFinalizedEpoch(request.epoch)) {
        handlePossiblyGoneResult(ctx, validatorsFuture, this::processResult);
      } else {
        handlePossiblyMissingResult(ctx, validatorsFuture, this::processResult);
      }
      ctx.header(Header.CACHE_CONTROL, CACHE_NONE);
    } catch (final IllegalArgumentException e) {
      ctx.result(jsonProvider.objectToJSON(new BadRequest(e.getMessage())));
      ctx.status(SC_BAD_REQUEST);
    } catch (JsonMappingException ex) {
      Throwable cause = ex.getCause();
      if (cause instanceof PublicKeyException) {
        ctx.result(
            jsonProvider.objectToJSON(
                new BadRequest("Public key is not valid: " + ex.getMessage())));
      }
      ctx.status(SC_BAD_REQUEST);
    }
  }
