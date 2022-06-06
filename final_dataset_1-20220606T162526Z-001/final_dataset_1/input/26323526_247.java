private boolean compare(PropertyValue lhsValue, PropertyValue rhsValue) {
    try {
      int result = lhsValue.compareTo(rhsValue);

      return
        comparison.getComparator() == Comparator.EQ  && result ==  0 ||
          comparison.getComparator() == Comparator.NEQ && result !=  0 ||
          comparison.getComparator() == Comparator.LT  && result == -1 ||
          comparison.getComparator() == Comparator.GT  && result ==  1 ||
          comparison.getComparator() == Comparator.LTE && result <=  0 ||
          comparison.getComparator() == Comparator.GTE && result >=  0;

    } catch (IllegalArgumentException e) {
      return comparison.getComparator() == Comparator.NEQ;
    }
  }
