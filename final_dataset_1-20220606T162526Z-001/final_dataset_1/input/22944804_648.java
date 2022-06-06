public void addTokenOperation(TokenType type, CTSOperation operation, boolean success) {

        // Update per-type operation count
        OperationStore operationStoreForTokenType = tokenOperations.get(type);
        if (operationStoreForTokenType == null) {
            operationStoreForTokenType = operationStoreFactory.createOperationStore();
            tokenOperations.put(type, operationStoreForTokenType);
        }
        operationStoreForTokenType.add(operation);

        // Update overall operation and failure counts as well
        addTokenOperation(operation, success);
    }
