@Override
    public boolean inverse() {
        boolean notEmpty = false;

        // Inverse all the words except last one
        final int last = usedWords - 1;
        for (int i = 0; i < last; i++) {
            words[i] = ~words[i];
            if (words[i] != 0)
                notEmpty = true;
        }

        // Fix bits in last word
        final int shift = size & 0x3f;
        if (shift == 0) {
            words[last] = ~words[last];
            if (words[last] != 0) {
                notEmpty = true;
            }
        } else {
            words[last] = ~words[last] & ~(-1L << shift);
            if (words[last] != 0) {
                notEmpty = true;
            }
        }

        return notEmpty;
    }
