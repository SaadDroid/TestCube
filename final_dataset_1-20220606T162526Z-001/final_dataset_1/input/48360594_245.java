@Override
    public void handleRequest(Object inputData, int rowNum) {
        if (conflictingRowNumbers.size() == 0) {
            handleRequest();
        }
    }
