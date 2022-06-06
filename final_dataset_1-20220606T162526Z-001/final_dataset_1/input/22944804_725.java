public byte[] perform(byte[] data) throws TokenStrategyFailedException {
        return apply(strategies, true, data);
    }
