@VisibleForTesting
  protected long getHighWatermark(ExtractType extractType, WatermarkType watermarkType) {
    LOG.debug("Getting high watermark");
    String timeZone = this.state.getProp(ConfigurationKeys.SOURCE_TIMEZONE);
    long highWatermark = ConfigurationKeys.DEFAULT_WATERMARK_VALUE;
    if (this.isWatermarkOverride()) {
      highWatermark = this.state.getPropAsLong(ConfigurationKeys.SOURCE_QUERYBASED_END_VALUE, 0);
      if (highWatermark == 0) {
        highWatermark = Long.parseLong(Utils.dateTimeToString(getCurrentTime(timeZone), WATERMARKTIMEFORMAT, timeZone));
      } else {
        // User specifies SOURCE_QUERYBASED_END_VALUE
        hasUserSpecifiedHighWatermark = true;
      }
      LOG.info("Overriding high water mark with the given end value:" + highWatermark);
    } else {
      if (isSnapshot(extractType)) {
        highWatermark = this.getSnapshotHighWatermark(watermarkType);
      } else {
        highWatermark = this.getAppendHighWatermark(extractType);
      }
    }
    return (highWatermark == 0 ? ConfigurationKeys.DEFAULT_WATERMARK_VALUE : highWatermark);
  }
