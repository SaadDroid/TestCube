public static boolean isBetterThan(Location locationA, Location locationB) {
    if (locationA == null) {
      return false;
    }

    if (locationB == null) {
      return true;
    }

    if (clock.getElapsedTimeInNanos(locationA)
        > clock.getElapsedTimeInNanos(locationB) + RECENT_UPDATE_THRESHOLD_IN_NANOS) {
      return true;
    }

    if (!locationA.hasAccuracy()) {
      return false;
    }

    if (!locationB.hasAccuracy()) {
      return true;
    }

    return locationA.getAccuracy() < locationB.getAccuracy();
  }
