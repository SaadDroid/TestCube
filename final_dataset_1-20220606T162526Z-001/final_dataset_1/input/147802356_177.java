@OpenApi(
      deprecated = true,
      path = ROUTE,
      method = HttpMethod.GET,
      summary = "Get the PeerIds of connected peers.",
      tags = {TAG_NETWORK},
      description =
          "Returns the base58-encoded PeerId of each peer connected to the beacon node."
              + " Replaced by standard api endpoint `/eth/v1/node/peers`.",
      responses = {
        @OpenApiResponse(
            status = RES_OK,
            content = @OpenApiContent(from = String.class, isArray = true)),
        @OpenApiResponse(status = RES_INTERNAL_ERROR)
      })
  @Override
  public void handle(Context ctx) throws Exception {
    ctx.header(Header.CACHE_CONTROL, CACHE_NONE);
    ctx.result(jsonProvider.objectToJSON(network.getPeersAsBase58()));
  }
