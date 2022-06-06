@Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Transformation)) {
      return false;
    }
    Transformation that = (Transformation) o;
    return Objects.equals(_guard, that._guard)
        && Objects.equals(_transformationSteps, that._transformationSteps)
        && Objects.equals(_andThen, that._andThen)
        && Objects.equals(_orElse, that._orElse);
  }
