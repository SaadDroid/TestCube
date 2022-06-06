@Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof MacAddress)) {
      return false;
    }
    return _longVal == ((MacAddress) obj)._longVal;
  }
