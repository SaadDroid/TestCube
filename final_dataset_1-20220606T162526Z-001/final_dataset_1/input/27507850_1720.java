@Override
  public boolean equals(@Nullable Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ConnectedRouteMetadata)) {
      return false;
    }
    ConnectedRouteMetadata that = (ConnectedRouteMetadata) o;
    return Objects.equals(_admin, that._admin)
        && Objects.equals(_generateLocalRoutes, that._generateLocalRoutes)
        && Objects.equals(_tag, that._tag);
  }
