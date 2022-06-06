public BloomFilter(double fpProb, int numElements) {
        this(numElements, (int)Math.ceil(numElements * Math.log(1 / fpProb) / Math.pow(Math.log(2), 2)));
    }
