public void setPulseDurationRange(double minMs, double maxMs) throws IOException {
        if (minMs >= maxMs) {
            throw new IllegalArgumentException("minMs must be less than maxMs");
        }
        if (minMs < 0) {
            throw new IllegalArgumentException("minMs must be greater than 0");
        }
        mMinPulseDuration = minMs;
        mMaxPulseDuration = maxMs;
        updateDutyCycle();
    }
