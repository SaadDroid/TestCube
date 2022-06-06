String serviceUrl(String requestPath, String queryString) {
    URI uri = URI.create(config.getServiceUrl());
    StringBuilder sb = new StringBuilder();
    sb.append(uri.getScheme());
    sb.append("://");
    sb.append(uri.getAuthority());
    sb.append(requestPath);

    queryString = QueryUtil.removeProtocolParameters(config.getProtocol(), 
        queryString);
    
    if (!queryString.isEmpty()) {
      sb.append('?');
      sb.append(queryString);
    }
  
    return sb.toString();
  }
