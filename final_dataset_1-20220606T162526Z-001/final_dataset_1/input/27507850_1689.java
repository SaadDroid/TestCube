public boolean remove(Prefix p, T e) {
    Node<T> node = exactMatchNode(p);
    if (node == null || !node._elements.contains(e)) {
      return false;
    }
    if (node._elements.size() == 1) {
      node._elements = ImmutableSet.of();
    } else {
      node._elements =
          node._elements.stream()
              .filter(el -> !el.equals(e))
              .collect(ImmutableSet.toImmutableSet());
    }
    return true;
  }
