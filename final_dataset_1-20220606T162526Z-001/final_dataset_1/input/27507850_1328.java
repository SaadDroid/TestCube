@VisibleForTesting
  static boolean isValidIcmpTypeOrCode(@Nonnull IntegerSpace icmpType) {
    return !icmpType.isEmpty() && VALID_ICMP_CODE_TYPE.contains(icmpType);
  }
