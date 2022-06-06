public Interval union(Interval other) {
    return new Interval(Math.min(myLowerBound, other.myLowerBound), Math.max(myUpperBound, other.myUpperBound));
  }
