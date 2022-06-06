@Override
  public WxMpPayRefundResult refundPay(Map<String, String> parameters)
      throws WxErrorException {
    SortedMap<String, String> refundParams = new TreeMap<String, String>(parameters);
    refundParams.put("appid",
        this.wxMpService.getWxMpConfigStorage().getAppId());
    refundParams.put("mch_id",
        this.wxMpService.getWxMpConfigStorage().getPartnerId());
    refundParams.put("nonce_str", System.currentTimeMillis() + "");
    refundParams.put("op_user_id",
        this.wxMpService.getWxMpConfigStorage().getPartnerId());
    String sign = this.createSign(refundParams,
        this.wxMpService.getWxMpConfigStorage().getPartnerKey());
    refundParams.put("sign", sign);

    StringBuilder request = new StringBuilder("<xml>");
    for (Map.Entry<String, String> para : refundParams.entrySet()) {
      request.append(String.format("<%s>%s</%s>", para.getKey(),
          para.getValue(), para.getKey()));
    }
    request.append("</xml>");

    String url = "https://api.mch.weixin.qq.com/secapi/pay/refund";
    String responseContent = this.wxMpService.post(url, request.toString());
    XStream xstream = XStreamInitializer.getInstance();
    xstream.processAnnotations(WxMpPayRefundResult.class);
    WxMpPayRefundResult wxMpPayRefundResult = (WxMpPayRefundResult) xstream
        .fromXML(responseContent);

    if (!"SUCCESS".equalsIgnoreCase(wxMpPayRefundResult.getResultCode())
        || !"SUCCESS".equalsIgnoreCase(wxMpPayRefundResult.getReturnCode())) {
      WxError error = new WxError();
      error.setErrorCode(-1);
      error.setErrorMsg("return_code:" + wxMpPayRefundResult.getReturnCode()
          + ";return_msg:" + wxMpPayRefundResult.getReturnMsg()
          + ";result_code:" + wxMpPayRefundResult.getResultCode() + ";err_code"
          + wxMpPayRefundResult.getErrCode() + ";err_code_des"
          + wxMpPayRefundResult.getErrCodeDes());
      throw new WxErrorException(error);
    }

    return wxMpPayRefundResult;
  }
