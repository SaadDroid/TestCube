@JsonIgnore
  public boolean isUp() {
    return !_DOWN_STATES.contains(_dbInstanceStatus);
  }
