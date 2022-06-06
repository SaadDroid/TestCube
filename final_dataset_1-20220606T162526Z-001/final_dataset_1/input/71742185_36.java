@Override
  public String setIndustry(WxMpIndustry wxMpIndustry) throws WxErrorException {
    if (null == wxMpIndustry.getPrimaryIndustry() || null == wxMpIndustry.getPrimaryIndustry().getId()
            || null == wxMpIndustry.getSecondIndustry() || null == wxMpIndustry.getSecondIndustry().getId()) {
      throw new IllegalArgumentException("industry id is empty");
    }
    String url = "https://api.weixin.qq.com/cgi-bin/template/api_set_industry";
    return this.post(url, wxMpIndustry.toJson());
  }
