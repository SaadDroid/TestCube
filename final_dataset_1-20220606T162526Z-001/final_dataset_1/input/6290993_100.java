public static <T, N extends Number> PCollection<T> weightedReservoirSample(
      PCollection<Pair<T, N>> input,
      int sampleSize) {
    return weightedReservoirSample(input, sampleSize, null);
  }
