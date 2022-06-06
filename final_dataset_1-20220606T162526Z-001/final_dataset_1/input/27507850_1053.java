@JsonCreator
  public static Ip parse(String ipAsString) {
    return create(ipStrToLong(ipAsString));
  }
