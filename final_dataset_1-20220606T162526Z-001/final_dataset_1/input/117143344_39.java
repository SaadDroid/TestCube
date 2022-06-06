public static <T> Collection<T> getKeyDims(Map<T, MutableDouble> map, int numDims) {
    NBest<Pair<T, MutableDouble>> nBest = new NBest<Pair<T, MutableDouble>>(numDims,
            new SecondPairComparator());
    fillNBest(nBest, map);
    Collection<T> kd = new ArrayList<T>();
    for (Pair<T, MutableDouble> pair : nBest.empty()) {
      kd.add(pair.first);
    }
    return kd;
  }
