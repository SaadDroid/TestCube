public static BDD isRelevantFor(BDDRoute record, PrefixRange range) {
    Prefix p = range.getPrefix();
    BDD prefixMatch = firstBitsEqual(record.getPrefix().getBitvec(), p, p.getPrefixLength());

    BDDInteger prefixLength = record.getPrefixLength();
    SubRange r = range.getLengthRange();
    int lower = r.getStart();
    int upper = r.getEnd();
    BDD lenMatch = prefixLength.range(lower, upper);

    return lenMatch.and(prefixMatch);
  }
