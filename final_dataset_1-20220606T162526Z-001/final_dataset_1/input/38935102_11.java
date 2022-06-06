@Override
  public boolean equals(@Nullable final Object that) {
    if (that == null) {
      return false;
    }
    if (this == that) {
      return true;
    }

    if (that instanceof ExtraLink) {
      return this.uri.equals(((ExtraLink) that).uri);
    } else {
      return false;
    }
  }
