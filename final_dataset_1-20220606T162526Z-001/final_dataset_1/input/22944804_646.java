@Override
    public void processError(Exception error) {
        store.addTokenOperation(null, operation, false);
        handler.processError(error);
    }
