@OpenApi(
      path = ROUTE,
      method = HttpMethod.GET,
      summary = "Get node version",
      description =
          "similar to [HTTP User-Agent](https://tools.ietf.org/html/rfc7231#section-5.5.3).",
      tags = {TAG_V1_NODE},
      responses = {
        @OpenApiResponse(status = RES_OK, content = @OpenApiContent(from = VersionResponse.class))
      })
  @Override
  public void handle(@NotNull final Context ctx) throws Exception {
    Version v = new Version(VersionProvider.VERSION);
    VersionResponse response = new VersionResponse(v);
    ctx.header(Header.CACHE_CONTROL, CACHE_NONE);
    ctx.result(jsonProvider.objectToJSON(response));
  }
