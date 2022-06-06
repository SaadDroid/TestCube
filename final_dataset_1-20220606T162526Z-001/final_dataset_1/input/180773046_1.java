@Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Stock)) {
      return false;
    }
    Stock that = (Stock) o;
    return this.symbol.equals(that.symbol)
        && this.date.equals(that.date)
        && this.value.equals(that.value);
  }
