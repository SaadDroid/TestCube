@Override
    public void commit() {
        if (context == null || context.size() == 0) {
            return;
        }
        LOGGER.info("Commit started");
        if (context.containsKey(IUnitOfWork.INSERT)) {
            commitInsert();
        }

        if (context.containsKey(IUnitOfWork.MODIFY)) {
            commitModify();
        }
        if (context.containsKey(IUnitOfWork.DELETE)) {
            commitDelete();
        }
        LOGGER.info("Commit finished.");
    }
