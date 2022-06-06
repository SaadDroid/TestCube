public List<RnRForm> queryAllUnsyncedForms() throws LMISException {
        List<RnRForm> unsyncedRnr = listNotSynchronizedFromStarTime();
        deleteDeactivatedAndUnsupportedProductItems(unsyncedRnr);
        return unsyncedRnr;
    }
