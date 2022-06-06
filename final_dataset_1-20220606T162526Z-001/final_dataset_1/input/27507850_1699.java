public <R> R fold(FoldOperator<T, R> operator) {
    if (_root == null) {
      return null;
    }
    return _root.fold(operator);
  }
