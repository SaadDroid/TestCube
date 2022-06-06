@Override
  public VolatilitySurface getSurface(final Map<OptionDefinition, Double> prices, final StandardOptionDataBundle data) {
    Validate.notNull(prices, "prices");
    Validate.notNull(data, "data");
    if (prices.size() < DEGREE) {
      throw new IllegalArgumentException("Price map contained " + prices.size() + " data point(s); need at least " + DEGREE);
    }
    final List<Double> kList = new ArrayList<>();
    final List<Double> tList = new ArrayList<>();
    final List<Double> sigmaList = new ArrayList<>();
    double k, t, sigma;
    for (final Map.Entry<OptionDefinition, Double> entry : prices.entrySet()) {
      k = entry.getKey().getStrike();
      t = entry.getKey().getTimeToExpiry(data.getDate());
      try {
        sigma = _bsmVolatilityModel.getSurface(Collections.<OptionDefinition, Double>singletonMap(entry.getKey(), entry.getValue()), data).getVolatility(DoublesPair.of(t, k));
        kList.add(k);
        tList.add(t);
        sigmaList.add(sigma);
      } catch (final Exception e) {
        s_logger.info("Problem getting BSM volatility for " + entry.getKey() + ", not using this option in regression. Error was: ", e);
      }
    }
    return new VolatilitySurface(FunctionalDoublesSurface.from(new MySurfaceFunction(getRegressionResult(kList.toArray(EMPTY_ARRAY), tList.toArray(EMPTY_ARRAY), sigmaList.toArray(EMPTY_ARRAY)))));
  }
