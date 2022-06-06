@Override
  public int compare(Schema s1, Schema s2) {
    // check physical type
    int comp = s1.getType().compareTo(s2.getType());
    if (comp != 0) {
      return comp;
    }

    // check logical types
    if (s1.getLogicalType() == null && s2.getLogicalType() != null) {
      return -1;
    } else if (s1.getLogicalType() != null && s2.getLogicalType() == null) {
      return 1;
    } else if (s1.getLogicalType() != null) {
      comp = s1.getLogicalType().compareTo(s2.getLogicalType());
      if (comp != 0) {
        return comp;
      }
    }

    // must be the same physical and logical type
    switch (s1.getType()) {
      case UNION:
        //noinspection ConstantConditions
        return compareLists(s1.getUnionSchemas(), s2.getUnionSchemas(), this::compare);
      case ARRAY:
        return compare(s1.getComponentSchema(), s2.getComponentSchema());
      case MAP:
        //noinspection ConstantConditions
        return compareMapSchemas(s1.getMapSchema(), s2.getMapSchema());
      case RECORD:
        return compareRecordSchemas(s1, s2);
    }
    return 0;
  }
