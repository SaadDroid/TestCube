public T getById(String id) {
    if (isWithinTransaction()) {
      Transaction tx = txManager.getCurrentTransaction();
      T txDto = null;
      Pair<TransactionStoreKey, TransactionStoreValue> pair;
      if (tx.isIsolatedTransaction()) {
        pair = memCache.getValueForIsolatedTransaction(tx.getId(), entityClass.getName(), id);
      }
      else {
        pair = memCache.getValueForNonIsolatedTransaction(entityClass.getName(), id);
      }
      // It means the value is either deleted earlier in the transaction or has to been saved.
      if (pair != null && (pair.getValue().getOpState() == null || OpState.DELETE.equals(pair.getValue().getOpState()))) {
        return null;
      }
      if (pair == null) {
        return this.readDao.getById(id);
      }
      else {
        txDto = pair.getValue().<T>getCurrentState();
        return txDto;
      }
    }
    else {
      return this.readDao.getById(id);
    }
  }
