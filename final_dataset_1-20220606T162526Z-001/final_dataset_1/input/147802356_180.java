@OpenApi(
      deprecated = true,
      path = ROUTE,
      method = HttpMethod.GET,
      summary = "Get the listening ENR address of the node.",
      tags = {TAG_NETWORK},
      description =
          "Returns the beacon node's listening Ethereum Node Record (ENR) address."
              + " Replaced by standard api endpoint `/eth/v1/node/identity`.",
      responses = {
        @OpenApiResponse(
            status = RES_OK,
            content = @OpenApiContent(from = String.class),
            description =
                "Base64-encoded ENR or an empty string if Node Discovery Protocol v5 is not used.")
      })
  @Override
  public void handle(Context ctx) throws Exception {
    ctx.header(Header.CACHE_CONTROL, CACHE_NONE);
    ctx.result(jsonProvider.objectToJSON(network.getEnr().orElse("")));
  }
