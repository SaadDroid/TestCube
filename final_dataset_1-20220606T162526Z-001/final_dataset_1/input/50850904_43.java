@Override
    public boolean getBetween(
            @NotNull
            final BitSet dest,
            final int fromInclusive,
            final int toExclusive) {
        assert 0 <= fromInclusive &&
                fromInclusive < toExclusive &&
                toExclusive <= keysCount;

        final ArrayBitSet target = borrowBitSet(dest.getSize());

        try {
            getTo(target, toExclusive);

            // edge case optimization
            if (fromInclusive != 0) {
                target.xor(elements, fromInclusive * bitSetSizeInBytes, bitSetSizeInLongs);
            }

            return dest.or(target);
        } finally {
            release(target);
        }
    }
