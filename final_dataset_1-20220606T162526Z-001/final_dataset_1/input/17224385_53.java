@Override
	public TransferAttempt prepareTransferForExecution(final Transfer transfer)
			throws ConveyorExecutionException {

		log.info("building transfer attempt...");
		if (transfer == null) {
			throw new IllegalArgumentException("transfer is null");
		}

		if (transfer.getId() == null) {
			throw new ConveyorExecutionException(
					"transfer does not have an id, it may not be stored in the transfer database");
		}

		transfer.setLastTransferStatus(TransferStatusEnum.OK);
		transfer.setTransferState(TransferStateEnum.PROCESSING);
		transfer.setUpdatedAt(new Timestamp(System.currentTimeMillis()));

		TransferAttempt transferAttempt = null;
		try {
			transferAttempt = transferAttemptDAO
					.findLastTransferAttemptForTransferByTransferId(transfer
							.getId());
			if (transferAttempt == null) {
				log.error("couldn't find the transfer attempt in transfer:{}",
						transfer);
				throw new ConveyorExecutionException(
						"Unable to find transfer attempt for execution");
			}
		} catch (TransferDAOException e) {
			log.error("error saving transfer", e);
			throw new ConveyorExecutionException(
					"error saving transfer attempt", e);
		}

		transferAttempt.setAttemptStart(new Timestamp(System
				.currentTimeMillis()));
		transferAttempt.setAttemptStatus(TransferStatusEnum.OK);
		transferAttempt.setUpdatedAt(transferAttempt.getAttemptStart());

		try {
			transferDAO.save(transfer);
			log.info("transfer saved:{}", transfer);
			return transferAttempt;
		} catch (TransferDAOException e) {
			log.error("error saving transfer", e);
			throw new ConveyorExecutionException(
					"error saving transfer attempt", e);
		}
	}
