@Override
  public boolean equals(Object obj) {
    if (Objects.isNull(obj)) {
      return false;
    }

    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Deposit)) {
      return false;
    }

    Deposit other = (Deposit) obj;
    return Objects.equals(this.getProof(), other.getProof())
        && Objects.equals(this.getData(), other.getData());
  }
