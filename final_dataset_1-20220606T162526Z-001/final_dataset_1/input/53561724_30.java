TimeStamp getTimestamp() throws TimeoutException {
        if (timestamp == null) {
            throw new TimeoutException();
        }
        TimeStamp ts = new TimeStamp(timestamp.ntpValue());
        long fraction = ts.getFraction();
        long seconds = ts.getSeconds();
        long nanoTime = System.nanoTime();
        long l = (nanoTime - nano) / 1_000_000_000;
        double v = (nanoTime - nano) / 1_000_000_000.0 - l;
        long i = (long) (v * 1_000_000_000);
        long fraction_ = fraction + i;
        if (fraction_ >= 1_000_000_000) {
            fraction_ -= 1_000_000_000;
            l++;
        }
        return new TimeStamp((seconds + l) << 32 | fraction_);
    }
