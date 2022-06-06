public static PresentValueSABRSensitivityDataBundle calculateNodeSensitivities(final PresentValueSABRSensitivityDataBundle sensitivities,
      final SABRInterestRateParameters parameters) {
    final Map<Double, Interpolator1DDataBundle> alphaData = (Map<Double, Interpolator1DDataBundle>) parameters.getAlphaSurface().getInterpolatorData();
    SurfaceValue alphaNode = new SurfaceValue();
    for (final Entry<DoublesPair, Double> entry : sensitivities.getAlpha().getMap().entrySet()) {
      final Map<DoublesPair, Double> weight = parameters.getAlphaSurface().getInterpolator().getNodeSensitivitiesForValue(alphaData, entry.getKey());
      alphaNode = SurfaceValue.plus(alphaNode, SurfaceValue.multiplyBy(SurfaceValue.from(weight), entry.getValue()));
    }
    final Map<Double, Interpolator1DDataBundle> betaData = (Map<Double, Interpolator1DDataBundle>) parameters.getBetaSurface().getInterpolatorData();
    SurfaceValue betaNode = new SurfaceValue();
    for (final Entry<DoublesPair, Double> entry : sensitivities.getBeta().getMap().entrySet()) {
      final Map<DoublesPair, Double> weight = parameters.getBetaSurface().getInterpolator().getNodeSensitivitiesForValue(betaData, entry.getKey());
      betaNode = SurfaceValue.plus(betaNode, SurfaceValue.multiplyBy(SurfaceValue.from(weight), entry.getValue()));
    }
    final Map<Double, Interpolator1DDataBundle> rhoData = (Map<Double, Interpolator1DDataBundle>) parameters.getRhoSurface().getInterpolatorData();
    SurfaceValue rhoNode = new SurfaceValue();
    for (final Entry<DoublesPair, Double> entry : sensitivities.getRho().getMap().entrySet()) {
      final Map<DoublesPair, Double> weight = parameters.getRhoSurface().getInterpolator().getNodeSensitivitiesForValue(rhoData, entry.getKey());
      rhoNode = SurfaceValue.plus(rhoNode, SurfaceValue.multiplyBy(SurfaceValue.from(weight), entry.getValue()));
    }
    final Map<Double, Interpolator1DDataBundle> nuData = (Map<Double, Interpolator1DDataBundle>) parameters.getNuSurface().getInterpolatorData();
    SurfaceValue nuNode = new SurfaceValue();
    for (final Entry<DoublesPair, Double> entry : sensitivities.getNu().getMap().entrySet()) {
      final Map<DoublesPair, Double> weight = parameters.getNuSurface().getInterpolator().getNodeSensitivitiesForValue(nuData, entry.getKey());
      nuNode = SurfaceValue.plus(nuNode, SurfaceValue.multiplyBy(SurfaceValue.from(weight), entry.getValue()));
    }
    return new PresentValueSABRSensitivityDataBundle(alphaNode, betaNode, rhoNode, nuNode);
  }
