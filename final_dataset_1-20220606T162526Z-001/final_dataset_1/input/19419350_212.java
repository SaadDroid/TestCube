public final void addTransactionSigner(TransactionSigner signer) {
        lock.lock();
        try {
            if (signer.isReady())
                signers.add(signer);
            else
                throw new IllegalStateException("Signer instance is not ready to be added into Wallet: " + signer.getClass());
        } finally {
            lock.unlock();
        }
    }
