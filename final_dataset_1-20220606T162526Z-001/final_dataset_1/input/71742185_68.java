@Override
  public List<WxDataCubeArticleResult> getUserShareHour(Date beginDate, Date endDate) throws WxErrorException {
    String url = API_URL_PREFIX + "/getusersharehour";
    JsonObject param = new JsonObject();
    param.addProperty("begin_date", this.dateFormat.format(beginDate));
    param.addProperty("end_date", this.dateFormat.format(endDate));
    String responseContent = this.wxMpService.post(url, param.toString());
    return WxDataCubeArticleResult.fromJson(responseContent);
  }
