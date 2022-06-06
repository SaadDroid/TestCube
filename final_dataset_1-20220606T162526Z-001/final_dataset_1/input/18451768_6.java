public static LocationResult extractResult(Intent intent) {
    if (!hasResult(intent)) {
      return null;
    }

    return intent.getParcelableExtra(EXTRA_LOCATION_RESULT);
  }
