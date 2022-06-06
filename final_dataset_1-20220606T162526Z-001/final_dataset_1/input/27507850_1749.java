@Override
  public String toString() {
    if (ALL.equals(this)) {
      return "icmp";
    }
    return "icmp/" + stringifySubRanges(_types);
  }
