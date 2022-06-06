@Override
    public boolean xor(
            @NotNull
            BitSet set) {
        assert size == set.getSize();

        boolean notEmpty = false;
        final long[] from = ((ArrayBitSet) set).toArray();
        for (int i = 0; i < usedWords; i++) {
            final long word = words[i] ^ from[i];
            words[i] = word;
            if (word != 0) {
                notEmpty = true;
            }
        }

        return notEmpty;
    }
