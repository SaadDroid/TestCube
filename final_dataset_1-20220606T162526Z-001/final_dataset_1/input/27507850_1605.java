@Override
  public @Nonnull Boolean visitCommunityIs(CommunityIs communityIs, Community arg) {
    return arg.equals(communityIs.getCommunity());
  }
