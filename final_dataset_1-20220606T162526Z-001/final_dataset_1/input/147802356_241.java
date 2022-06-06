@OpenApi(
      path = ROUTE,
      method = HttpMethod.POST,
      summary = "Subscribe beacon node to committee attestation subnet.",
      tags = {TAG_VALIDATOR},
      requestBody =
          @OpenApiRequestBody(
              content = {@OpenApiContent(from = SubscribeToBeaconCommitteeRequest.class)}),
      description =
          "After Beacon node receives this request it has to:\n"
              + "- add subnet to ENR\n"
              + "- announce subnet topic subscription on gossipsub\n"
              + "- search using discv5 for peers related to this subnet and replace current peers with those ones if neccessary\n"
              + "- aggregate attestations received on that subnet\n",
      responses = {
        @OpenApiResponse(
            status = RES_OK,
            description =
                "Slot signature is valid and beacon node is subscribed to given committee attestation subnet."),
        @OpenApiResponse(status = RES_BAD_REQUEST, description = "Invalid request syntax."),
        @OpenApiResponse(status = RES_INTERNAL_ERROR, description = "Beacon node internal error.")
      })
  @Override
  public void handle(Context ctx) throws Exception {
    try {
      final SubscribeToBeaconCommitteeRequest request =
          jsonProvider.jsonToObject(ctx.body(), SubscribeToBeaconCommitteeRequest.class);

      provider.subscribeToBeaconCommitteeForAggregation(request);
      ctx.status(SC_OK);
    } catch (final JsonMappingException e) {
      ctx.result(jsonProvider.objectToJSON(new BadRequest(e.getMessage())));
      ctx.status(SC_BAD_REQUEST);
    } catch (Exception e) {
      ctx.status(SC_INTERNAL_SERVER_ERROR);
    }
  }
