@Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", getMessageUniqueId())
        .append("channelID", getChannelId())
        .append("workflowID", getWorkflowId())
        .append("messageEvents", getMleMarkers()).toString();
  }
