@Override
    public CompletableFuture<Versioned<LedgerMetadata>> readLedgerMetadata(long ledgerId) {
        return readLedgerMetadata(ledgerId, null);
    }
