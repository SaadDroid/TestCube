@Override
  public String postAuthUrl(String requestUrl, String queryString) {
    StringBuilder sb = new StringBuilder();
    sb.append(requestUrl);
    queryString = QueryUtil.removeProtocolParameters(config.getProtocol(), 
        queryString);
    if (!queryString.isEmpty()) {
      sb.append('?');
      sb.append(queryString);
    }
    return sb.toString();
  }
