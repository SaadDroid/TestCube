@Override
  public ObjectsPair<Collection<LiveDataSpecification>, Collection<LiveDataSpecification>> splitShouldFake(
      FakeSubscriptionBloombergLiveDataServer server, Collection<LiveDataSpecification> uniqueIds) {
    Collection<LiveDataSpecification> real = uniqueIds;
    Set<LiveDataSpecification> fakes = new HashSet<LiveDataSpecification>();
    for (FakeSubscriptionSelector subSelector : _fakeSubscriptionSelectors) {
      ObjectsPair<Collection<LiveDataSpecification>, Collection<LiveDataSpecification>> split = subSelector.splitShouldFake(server, real);
      real = split.first;
      fakes.addAll(split.second);
      if (real.isEmpty()) {
        break;
      }
    }
    return ObjectsPair.of(real, (Collection<LiveDataSpecification>) fakes);
  }
