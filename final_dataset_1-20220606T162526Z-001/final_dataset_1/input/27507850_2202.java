@Override
  public boolean equals(@Nullable Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof UndirectedEdge)) {
      return false;
    }
    UndirectedEdge<?> rhs = (UndirectedEdge<?>) obj;
    return _nodeU.equals(rhs._nodeU) && _nodeV.equals(rhs._nodeV);
  }
