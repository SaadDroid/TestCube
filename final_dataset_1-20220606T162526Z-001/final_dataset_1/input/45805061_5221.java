@Override
  public Temporal adjustInto(final Temporal temporal) {
    return temporal.with(_adjuster);
  }
