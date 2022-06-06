public double calculate(final double assetReturn, final double benchmarkReturn, final double assetStandardDeviation) {
    return (assetReturn - benchmarkReturn) / assetStandardDeviation;
  }
