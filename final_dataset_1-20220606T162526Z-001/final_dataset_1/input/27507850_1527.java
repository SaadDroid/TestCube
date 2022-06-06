@Override
  public boolean matchCommunity(Environment environment, Community community) {
    // A literal community conjunction cannot match a single community.
    return false;
  }
