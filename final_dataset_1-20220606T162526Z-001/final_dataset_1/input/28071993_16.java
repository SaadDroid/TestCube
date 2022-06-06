@CheckResult @NonNull
  public Preference<String> getString(@NonNull String key) {
    return getString(key, DEFAULT_STRING);
  }
