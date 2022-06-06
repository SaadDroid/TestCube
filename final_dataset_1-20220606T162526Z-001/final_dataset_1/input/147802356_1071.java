@Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final WeakSubjectivityConfig that = (WeakSubjectivityConfig) o;
    return Objects.equals(safetyDecay, that.safetyDecay)
        && Objects.equals(weakSubjectivityCheckpoint, that.weakSubjectivityCheckpoint)
        && Objects.equals(suppressWSPeriodChecksUntilEpoch, that.suppressWSPeriodChecksUntilEpoch);
  }
