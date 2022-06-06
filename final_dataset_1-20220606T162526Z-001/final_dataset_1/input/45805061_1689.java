@Override
  public Double interpolate(final InterpolatorNDDataBundle data, final double[] x) {      
    validateInput(data, x);
    Validate.isTrue(data instanceof KrigingInterpolatorDataBundle, "KriginInterpolatorND needs a KriginInterpolatorDataBundle");
    KrigingInterpolatorDataBundle krigingData = (KrigingInterpolatorDataBundle) data;
    final List<Pair<double[], Double>> rawData = krigingData.getData();
    final Function1D<Double, Double> variogram = krigingData.getVariogram();
    final double[] w = krigingData.getWeights();

    final int n = rawData.size();
    double sum = 0.0;
    double r;
    for (int i = 0; i < n; i++) {
      r = DistanceCalculator.getDistance(x, rawData.get(i).getFirst());
      sum += variogram.evaluate(r) * w[i];
    }
    sum += w[n];

    return sum;
  }
