@VisibleForTesting
  @Nullable
  public static String getSuperInterfaceName(String ifaceName) {
    Matcher matcher = SUBINTERFACE_PATTERN.matcher(ifaceName);
    if (matcher.matches()) {
      return matcher.group(1);
    }
    return null;
  }
