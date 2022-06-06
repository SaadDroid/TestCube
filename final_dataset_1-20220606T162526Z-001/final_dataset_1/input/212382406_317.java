@Override
  protected boolean validate() {
    return currentHealthyPipelineCount >= healthyPipelineThresholdCount;
  }
