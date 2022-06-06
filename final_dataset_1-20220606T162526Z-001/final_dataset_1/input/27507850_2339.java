@JsonIgnore
  @Nullable
  public InterfaceRuntimeData getInterface(String ifaceName) {
    return _interfaces.get(ifaceName);
  }
