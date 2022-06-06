FP2Immutable sub(FP2Immutable a) {
    FP2 result = new FP2(fp2);
    result.sub(a.fp2);
    result.norm();
    return new FP2Immutable(result);
  }
