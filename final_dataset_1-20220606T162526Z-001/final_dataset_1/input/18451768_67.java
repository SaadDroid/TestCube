@Override public Location getLastLocation() {
    final List<String> providers = locationManager.getAllProviders();
    final long minTime = clock.getSystemElapsedTimeInNanos() - RECENT_UPDATE_THRESHOLD_IN_NANOS;

    Location bestLocation = null;
    float bestAccuracy = Float.MAX_VALUE;
    long bestTime = Long.MIN_VALUE;

    for (String provider : providers) {
      try {
        final Location location = locationManager.getLastKnownLocation(provider);
        if (location != null) {
          final float accuracy = location.getAccuracy();
          final long time = clock.getElapsedTimeInNanos(location);
          if (time > minTime && accuracy < bestAccuracy) {
            bestLocation = location;
            bestAccuracy = accuracy;
            bestTime = time;
          } else if (time < minTime && bestAccuracy == Float.MAX_VALUE && time > bestTime) {
            bestLocation = location;
            bestTime = time;
          }
        }
      } catch (SecurityException e) {
        Log.e(TAG, "Permissions not granted for provider: " + provider, e);
      }
    }

    return bestLocation;
  }
