@Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (obj instanceof Offsets) {
      Offsets that = (Offsets) obj;

      return this.offsetsAsOfTime == that.offsetsAsOfTime
          && this.offsets.equals(that.offsets);
    }

    return false;
  }
