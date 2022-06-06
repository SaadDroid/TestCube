@Override
  public boolean matchCommunities(Environment environment, Set<Community> communitySetCandidate) {
    return Sets.intersection(_requiredCommunities, communitySetCandidate).size()
        == _requiredCommunities.size();
  }
