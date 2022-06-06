@Override
  public String logoutUrl(String path) {
    if (path != null && !path.startsWith("/")) {
      throw new IllegalArgumentException(
        "must specify an absolute path for an application resource");
    }
    final StringBuilder url = new StringBuilder();
    final String serverUrl = config.getServerUrl();
    url.append(appendPathToUrl(serverUrl, LOGOUT_PATH));
    if (path != null) {
      url.append("?url=");
      url.append(CommonUtils.urlEncode(applicationUrl(path)));
    }
    return url.toString();
  }
