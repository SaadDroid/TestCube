public static <T> List<List<T>> cartesianProduct(List<List<T>> inputs) {
    return cartesianProduct(ImmutableList.<T>of(), inputs);
  }
