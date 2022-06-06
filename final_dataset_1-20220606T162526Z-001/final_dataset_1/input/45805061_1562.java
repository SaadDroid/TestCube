@Override
  public int size() {
    int size = 0;
    for (final DoublesCurve underlying : _curves) {
      if (underlying instanceof InterpolatedDoublesCurve || underlying instanceof NodalDoublesCurve || underlying instanceof SpreadDoublesCurve) {
        size += underlying.size();
      }
    }
    if (size != 0) {
      return size;
    }
    throw new UnsupportedOperationException("Size not supported for SpreadDoublesCurve " + getLongName());
  }
