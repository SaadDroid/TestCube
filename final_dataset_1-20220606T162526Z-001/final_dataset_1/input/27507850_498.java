@VisibleForTesting
  @Nullable
  public static Integer getEncapsulationVlan(InterfacesInterface iface) {
    Matcher matcher = ENCAPSULATION_VLAN_PATTERN.matcher(iface.getName());
    return matcher.matches() ? Integer.parseInt(matcher.group(1)) : null;
  }
