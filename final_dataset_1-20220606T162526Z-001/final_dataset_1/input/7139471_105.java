@Override public Intent createIntent() {
    Intent vpIntent = super.createIntent();

    vpIntent.putExtra("forcename", videoContent.getTitle());
    vpIntent.putExtra("forcedirect", true);
    vpIntent.putExtra("startfrom", videoContent.getResumeOffset());
    if (videoContent.getSubtitle() != null) {
      Subtitle subtitle = videoContent.getSubtitle();
      if (!"none".equals(subtitle.getFormat())) {
        vpIntent.putExtra("forcedsrt", subtitle.getKey());
      }
    }
    return vpIntent;
  }
