@Override
  public void define(Context context) {
    NewBuiltInQualityProfile profile = context.createBuiltInQualityProfile(KotlinPlugin.PROFILE_NAME, KotlinPlugin.KOTLIN_LANGUAGE_KEY);
    BuiltInQualityProfileJsonLoader.load(profile, KotlinPlugin.KOTLIN_REPOSITORY_KEY, PATH_TO_JSON);
    profile.done();
  }
