@Override
  public MarketDataProvider create(UserPrincipal user, MarketDataSpecification marketDataSpec) {
    ArgumentChecker.notNull(user, "user");
    ArgumentChecker.notNull(marketDataSpec, "marketDataSpec");
    LiveMarketDataSpecification liveSpec = (LiveMarketDataSpecification) marketDataSpec;
    if (liveSpec.getDataSource() == null) {
      return _defaultFactory.create(user);
    }
    LiveDataFactory liveDataFactory = _namedFactories.get(liveSpec.getDataSource());
    if (liveDataFactory == null) {
      throw new IllegalArgumentException("No provider could be created for data source '" + liveSpec.getDataSource() + "'");
    }
    return liveDataFactory.create(user);
  }
