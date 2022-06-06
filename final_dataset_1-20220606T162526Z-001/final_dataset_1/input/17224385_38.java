@Override
    public void deleteGridAccount(final GridAccount gridAccount)
            throws ConveyorBusyException, ConveyorExecutionException {
        log.info("deleteGridAccount()");

        if (gridAccount == null) {
            throw new IllegalArgumentException("null gridAccount");
        }

        log.info("gridAccount:{}", gridAccount);

        // lock queue so as not to delete an account involved with a running
        // transfer, deleting the account would delete the transfer data
        try {
            getConveyorExecutorService().setBusyForAnOperation();
            gridAccountDAO.delete(gridAccount);
        } catch (TransferDAOException e) {
            log.error("exception deleting", e);
            throw new ConveyorExecutionException("error deleting account", e);
        } finally {
            getConveyorExecutorService().setOperationCompleted();
        }
    }
