public void setRewatchCount(final int rewatchCount) {
        if (rewatchCount < 0) {
            throw new IllegalArgumentException("rewatchCount is negative: " + rewatchCount);
        }

        mRewatchCount = rewatchCount;
    }
