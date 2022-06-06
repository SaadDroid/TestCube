@Override
  public WxMpUserBlacklistGetResult getBlacklist(String nextOpenid) throws WxErrorException {
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("begin_openid", nextOpenid);
    String url = API_BLACKLIST_PREFIX + "/getblacklist";
    String responseContent = this.wxMpService.execute(new SimplePostRequestExecutor(), url, jsonObject.toString());
    return WxMpUserBlacklistGetResult.fromJson(responseContent);
  }
