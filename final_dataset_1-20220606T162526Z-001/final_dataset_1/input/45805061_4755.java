public static List<DoublesPair> addSensitivity(final List<DoublesPair> sensi1, final List<DoublesPair> sensi2) {
    final List<DoublesPair> result = new ArrayList<>(sensi1);
    result.addAll(sensi2);
    return result;
  }
