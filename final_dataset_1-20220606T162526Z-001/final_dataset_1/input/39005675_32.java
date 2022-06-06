public int length() {
        final long[] words = this.words;
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i] != 0L) {
                return (i << 6) + (64 - Long.numberOfLeadingZeros(words[i]));
            }
        }
        return 0;
    }
