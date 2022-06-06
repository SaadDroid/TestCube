@Override
  public String[] getFileSuffixes() {
    String[] suffixes = configuration.getStringArray(RubyPlugin.RUBY_FILE_SUFFIXES_KEY);
    if (suffixes == null || suffixes.length == 0) {
      suffixes = RubyPlugin.RUBY_FILE_SUFFIXES_DEFAULT_VALUE.split(",");
    }
    return suffixes;
  }
