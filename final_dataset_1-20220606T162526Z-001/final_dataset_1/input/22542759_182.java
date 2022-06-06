public String buildWithLocation(Location location) {
    return startBuild()
      .append("SET LOCATION '")
      .append(location.toURI().toString())
      .append("'")
      .toString();
  }
