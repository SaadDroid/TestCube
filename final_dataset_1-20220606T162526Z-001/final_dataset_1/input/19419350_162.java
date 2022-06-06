public void checkCoinBaseHeight(final int height)
            throws VerificationException {
        checkArgument(height >= Block.BLOCK_HEIGHT_GENESIS);
        checkState(isCoinBase());

        // Check block height is in coinbase input script
        final TransactionInput in = this.getInputs().get(0);
        final ScriptBuilder builder = new ScriptBuilder();
        builder.number(height);
        final byte[] expected = builder.build().getProgram();
        final byte[] actual = in.getScriptBytes();
        if (actual.length < expected.length) {
            throw new VerificationException.CoinbaseHeightMismatch("Block height mismatch in coinbase.");
        }
        for (int scriptIdx = 0; scriptIdx < expected.length; scriptIdx++) {
            if (actual[scriptIdx] != expected[scriptIdx]) {
                throw new VerificationException.CoinbaseHeightMismatch("Block height mismatch in coinbase.");
            }
        }
    }
