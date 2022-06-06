public static ExtendedCommunity of(int type, long globalAdministrator, long localAdministrator) {
    checkArgument(
        type >= 0 && type <= 0xFFFF,
        "Extended community type %s is not within the allowed range",
        type);
    byte typeByte = (byte) (type >> 8);
    checkArgument(
        _validTypes.contains(typeByte), "Not a valid BGP extended community type: %s", type);
    checkArgument(
        globalAdministrator >= 0 && localAdministrator >= 0,
        "Administrator values must be positive");
    if (typeByte == 0x00 || typeByte == 0x40) {
      checkArgument(
          globalAdministrator <= 0xFFFFL && localAdministrator <= 0xFFFFFFFFL,
          "Extended community administrator values are not within the allowed range");
    } else {
      checkArgument(
          globalAdministrator <= 0xFFFFFFFFL && localAdministrator <= 0xFFFFL,
          "Extended community administrator values are not within the allowed range");
    }
    return new ExtendedCommunity(
        typeByte, (byte) (type & 0xFF), globalAdministrator, localAdministrator);
  }
