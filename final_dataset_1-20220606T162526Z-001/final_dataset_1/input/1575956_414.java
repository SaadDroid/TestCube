public static HashStreamRanges ofHash(RangeKeyType keyType,
                                          NavigableMap<Long, RangeProperties> ranges) {
        checkArgument(RangeKeyType.HASH == keyType,
            "Only hash routing is supported now. %s is not supported.", keyType);
        NavigableMap<Long, RangeProperties> readOnlyRanges = Collections.unmodifiableNavigableMap(ranges);
        long maxRangeId = 0L;
        for (RangeProperties props : ranges.values()) {
            maxRangeId = Math.max(maxRangeId, props.getRangeId());
        }
        return new HashStreamRanges(readOnlyRanges, maxRangeId);
    }
