public boolean putAll(Prefix p, Collection<T> elements) {
    if (_root == null || !_root._prefix.containsPrefix(p)) {
      _root = combine(new Node<T>(p, elements), _root);
      return true;
    }
    Node<T> node = _root.findOrCreateNode(p);
    if (node._elements.containsAll(elements)) {
      return false;
    }
    node._elements = ImmutableSet.<T>builder().addAll(node._elements).addAll(elements).build();
    return true;
  }
