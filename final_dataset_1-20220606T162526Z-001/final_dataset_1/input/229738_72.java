public void setTransactionIsolation(TransactionIsolationLevel level) {
        if (level != TransactionIsolationLevel.UNKNOWN) {
            setTransactionIsolation(level.intValue());
        }
    }
