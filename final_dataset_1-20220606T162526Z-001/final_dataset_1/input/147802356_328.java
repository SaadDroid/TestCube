boolean isTimeReached(final UInt64 currentTime, final UInt64 earliestTime) {
    return currentTime.compareTo(earliestTime) >= 0;
  }
