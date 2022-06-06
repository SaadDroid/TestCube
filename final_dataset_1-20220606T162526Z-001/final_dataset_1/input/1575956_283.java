static List<Long> getEntriesToSearch(
            long transactionId,
            LogRecordWithDLSN firstRecord,
            LogRecordWithDLSN lastRecord,
            int nWays) {
        long txnDiff = lastRecord.getTransactionId() - firstRecord.getTransactionId();
        if (txnDiff > 0) {
            if (lastRecord.getTransactionId() == transactionId) {
                List<Long> entries = getEntriesToSearch(
                        firstRecord.getDlsn().getEntryId() + 1,
                        lastRecord.getDlsn().getEntryId() - 2,
                        Math.max(MIN_SEARCH_BATCH_SIZE, nWays - 1));
                entries.add(lastRecord.getDlsn().getEntryId() - 1);
                return entries;
            } else {
                // TODO: improve it by estimating transaction ids.
                return getEntriesToSearch(
                        firstRecord.getDlsn().getEntryId() + 1,
                        lastRecord.getDlsn().getEntryId() - 1,
                        nWays);
            }
        } else {
            // unexpected condition
            return Lists.newArrayList();
        }
    }
