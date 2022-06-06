@Override
  public boolean containsPattern(@Nullable final File baseFolder, @Nonnull final Pattern pattern) {
    return pattern.matcher(this.text).find();
  }
