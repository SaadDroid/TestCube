@Override
  public boolean equals(@Nullable Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof TraceTree)) {
      return false;
    }
    TraceTree other = (TraceTree) o;
    return Objects.equals(_traceElement, other._traceElement) && _children.equals(other._children);
  }
