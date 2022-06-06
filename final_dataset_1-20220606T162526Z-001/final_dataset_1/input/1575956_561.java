public static boolean keyRangeOverlaps(RangeProperties meta1, RangeProperties meta2) {
        return keyRangeOverlaps(
            meta1.getStartHashKey(), meta1.getEndHashKey(),
            meta2.getStartHashKey(), meta2.getEndHashKey());
    }
