public static boolean hasResult(Intent intent) {
    return intent != null && intent.hasExtra(EXTRA_LOCATION_RESULT);
  }
