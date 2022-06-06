@Override
  public WxMpPayResult getJSSDKPayResult(String transactionId,
      String outTradeNo) throws WxErrorException {
    String nonce_str = System.currentTimeMillis() + "";

    SortedMap<String, String> packageParams = new TreeMap<String, String>();
    packageParams.put("appid",
        this.wxMpService.getWxMpConfigStorage().getAppId());
    packageParams.put("mch_id",
        this.wxMpService.getWxMpConfigStorage().getPartnerId());

    if (transactionId != null && !"".equals(transactionId.trim())) {
      packageParams.put("transaction_id", transactionId);
    } else if (outTradeNo != null && !"".equals(outTradeNo.trim())) {
      packageParams.put("out_trade_no", outTradeNo);
    } else {
      throw new IllegalArgumentException(
          "Either 'transactionId' or 'outTradeNo' must be given.");
    }

    packageParams.put("nonce_str", nonce_str);
    packageParams.put("sign", this.createSign(packageParams,
        this.wxMpService.getWxMpConfigStorage().getPartnerKey()));

    StringBuilder request = new StringBuilder("<xml>");
    for (Map.Entry<String, String> para : packageParams.entrySet()) {
      request.append(String.format("<%s>%s</%s>", para.getKey(),
          para.getValue(), para.getKey()));
    }
    request.append("</xml>");

    String url = "https://api.mch.weixin.qq.com/pay/orderquery";
    String responseContent = this.wxMpService.post(url, request.toString());
    XStream xstream = XStreamInitializer.getInstance();
    xstream.alias("xml", WxMpPayResult.class);
    return (WxMpPayResult) xstream.fromXML(responseContent);
  }
