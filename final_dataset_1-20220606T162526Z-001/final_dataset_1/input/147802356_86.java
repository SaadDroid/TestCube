public static UInt64 calculateEth1DataCacheDurationPriorToCurrentTime() {
    // Add in the difference between current time and a block ETH1_FOLLOW_DISTANCE behind.
    return calculateEth1DataCacheDurationPriorToFollowDistance()
        .plus(SECONDS_PER_ETH1_BLOCK.times(ETH1_FOLLOW_DISTANCE));
  }
