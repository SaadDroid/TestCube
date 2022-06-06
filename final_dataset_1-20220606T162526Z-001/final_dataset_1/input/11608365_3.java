public static void register(XAResourceProducer producer) throws RecoveryException {
        try {
            final boolean alreadyRunning = TransactionManagerServices.isTransactionManagerRunning();
            final ProducerHolder holder = alreadyRunning ? new InitializableProducerHolder(producer) : new ProducerHolder(producer);

            if (resources.add(holder)) {
                if (holder instanceof InitializableProducerHolder) {
                    boolean recovered = false;
                    try {
                        if (log.isDebugEnabled()) { log.debug("Transaction manager is running, recovering resource '" + holder.getUniqueName() + "'."); }
                        IncrementalRecoverer.recover(producer);
                        ((InitializableProducerHolder) holder).initialize();
                        recovered = true;
                    } finally {
                        if (!recovered) { resources.remove(holder); }
                    }
                }
            } else {
                throw new IllegalStateException("A resource with uniqueName '" + holder.getUniqueName() + "' has already been registered. " +
                        "Cannot register XAResourceProducer '" + producer + "'.");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Cannot register the XAResourceProducer '" + producer + "' caused by invalid input.", e);
        }
    }
