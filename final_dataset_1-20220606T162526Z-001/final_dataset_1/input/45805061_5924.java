public static void parallelBinarySort(final double[] keys, final double[] values) {
    Validate.notNull(keys, "x data");
    Validate.notNull(values, "y data");
    Validate.isTrue(keys.length == values.length);
    final int n = keys.length;
    dualArrayQuickSort(keys, values, 0, n - 1);
  }
