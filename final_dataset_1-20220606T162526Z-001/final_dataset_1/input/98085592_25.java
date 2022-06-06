@Override
  public boolean equals(Object obj) {
    // Manual short-cuts for the important special cases.
    if (this == obj) {
      return true;
    } else if (obj instanceof TermId) {
      final TermId that = (TermId) obj;
      return this.prefix.equals(that.getPrefix()) && (this.id.equals(that.getId()));
    } else {
      return false;
    }
  }
