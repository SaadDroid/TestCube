@Override
  public void setActualHighWatermark(WorkUnitState wus) {
    if (Boolean.valueOf(wus.getPropAsBoolean(IS_WATERMARK_WORKUNIT_KEY))) {
      wus.setActualHighWatermark(wus.getWorkunit().getExpectedHighWatermark(MultiKeyValueLongWatermark.class));
    } else {
      wus.setActualHighWatermark(wus.getWorkunit().getExpectedHighWatermark(LongWatermark.class));
    }
  }
