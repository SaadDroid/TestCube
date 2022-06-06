public double parRate(final InterestRateFutureSecurity futures, final MulticurveProviderInterface multicurves) {
    ArgumentChecker.notNull(futures, "Futures");
    ArgumentChecker.notNull(multicurves, "Multi-curves provider");
    return multicurves.getSimplyCompoundForwardRate(futures.getIborIndex(), futures.getFixingPeriodStartTime(), futures.getFixingPeriodEndTime(),
        futures.getFixingPeriodAccrualFactor());
  }
