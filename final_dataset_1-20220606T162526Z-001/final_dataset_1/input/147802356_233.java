@OpenApi(
      deprecated = true,
      path = ROUTE,
      method = HttpMethod.POST,
      summary = "Get the validator duties for the specified epoch.",
      tags = {TAG_VALIDATOR},
      description =
          "Returns the validator duties for validators that match the specified public keys and epoch.\n\n"
              + "Public keys that do not match a validator are returned without validator information.\n"
              + "Deprecated - use`/eth/v1/validator/duties/attester/{epoch}` and "
              + "`/eth/v1/validator/duties/proposer/{epoch}` instead.",
      requestBody =
          @OpenApiRequestBody(
              content = @OpenApiContent(from = ValidatorsRequest.class),
              description =
                  "```\n{\n  \"epoch\": (uint64),\n  \"pubkeys\": [(Bytes48 as Hex String)]\n}\n```"),
      responses = {
        @OpenApiResponse(
            status = RES_OK,
            content = @OpenApiContent(from = ValidatorDuties.class, isArray = true),
            description =
                "List of validators, including information about a validator's attestation committee index"
                    + " and block proposal slot."),
        @OpenApiResponse(status = RES_NO_CONTENT, description = NO_CONTENT_PRE_GENESIS),
        @OpenApiResponse(status = RES_BAD_REQUEST, description = INVALID_BODY_SUPPLIED),
        @OpenApiResponse(status = RES_INTERNAL_ERROR)
      })
  @Override
  public void handle(Context ctx) throws Exception {
    try {
      ValidatorDutiesRequest validatorDutiesRequest =
          jsonProvider.jsonToObject(ctx.body(), ValidatorDutiesRequest.class);

      SafeFuture<Optional<List<ValidatorDuties>>> future =
          provider.getValidatorDutiesByRequest(validatorDutiesRequest);
      ctx.header(Header.CACHE_CONTROL, CACHE_NONE);
      if (provider.isEpochFinalized(validatorDutiesRequest.epoch)) {
        handlePossiblyGoneResult(ctx, future);
      } else {
        handlePossiblyMissingResult(ctx, future);
      }
    } catch (final IllegalArgumentException e) {
      ctx.result(jsonProvider.objectToJSON(new BadRequest(e.getMessage())));
      ctx.status(SC_BAD_REQUEST);
    } catch (final JsonMappingException ex) {
      ctx.result(jsonProvider.objectToJSON(new BadRequest(ex.getMessage())));
      ctx.status(SC_BAD_REQUEST);
    }
  }
