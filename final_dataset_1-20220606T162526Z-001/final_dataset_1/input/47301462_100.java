public static <TSource, TInner, TResult> Enumerable<TResult> thetaJoin(
      final Enumerable<TSource> outer, final Enumerable<TInner> inner,
      final Predicate2<TSource, TInner> predicate,
      Function2<TSource, TInner, TResult> resultSelector,
      final boolean generateNullsOnLeft,
      final boolean generateNullsOnRight) {
    // Building the result as a list is easy but hogs memory. We should iterate.
    final List<TResult> result = Lists.newArrayList();
    final Enumerator<TSource> lefts = outer.enumerator();
    final List<TInner> rightList = inner.toList();
    final Set<TInner> rightUnmatched;
    if (generateNullsOnLeft) {
      rightUnmatched = Sets.newIdentityHashSet();
      rightUnmatched.addAll(rightList);
    } else {
      rightUnmatched = null;
    }
    while (lefts.moveNext()) {
      int leftMatchCount = 0;
      final TSource left = lefts.current();
      final Enumerator<TInner> rights = Linq4j.iterableEnumerator(rightList);
      while (rights.moveNext()) {
        TInner right = rights.current();
        if (predicate.apply(left, right)) {
          ++leftMatchCount;
          if (rightUnmatched != null) {
            rightUnmatched.remove(right);
          }
          result.add(resultSelector.apply(left, right));
        }
      }
      if (generateNullsOnRight && leftMatchCount == 0) {
        result.add(resultSelector.apply(left, null));
      }
    }
    if (rightUnmatched != null) {
      final Enumerator<TInner> rights =
          Linq4j.iterableEnumerator(rightUnmatched);
      while (rights.moveNext()) {
        TInner right = rights.current();
        result.add(resultSelector.apply(null, right));
      }
    }
    return Linq4j.asEnumerable(result);
  }
