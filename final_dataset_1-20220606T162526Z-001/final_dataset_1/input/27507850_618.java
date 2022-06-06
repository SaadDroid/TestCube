@Override
  public boolean equals(@Nullable Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof TransitGateway)) {
      return false;
    }
    TransitGateway that = (TransitGateway) o;
    return _gatewayId.equals(that._gatewayId)
        && _options.equals(that._options)
        && _ownerId.equals(that._ownerId)
        && _tags.equals(that._tags);
  }
