@Nonnull
  public static RouteDistinguisher from(int asn1, long asn2) {
    checkArgument(asn1 >= 0 && asn1 <= 0xFFFF, ERR_MSG_SHORT_TEMPLATE, asn1);
    checkArgument(asn2 >= 0 && asn2 <= 0xFFFFFFFFL, ERR_MSG_INT_TEMPLATE, asn2);
    return new RouteDistinguisher(((long) asn1 << 32) | asn2, Type.TYPE0);
  }
