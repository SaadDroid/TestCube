public double totalSensitivity() {
    double total = 0.0;
    for (final List<DoublesPair> pairs : _sensitivity.values()) {
      for (final DoublesPair p : pairs) {
        total += p.second;
      }
    }
    return total;
  }
