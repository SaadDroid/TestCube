@Override
	public ExecResult execute(final TransferStatus transferStatus)
			throws MicroserviceException {

		log.info("execute");

		Transfer oldTransfer = getInvocationContext().getTransferAttempt()
				.getTransfer();

		log.info("currentTransfer:{}", oldTransfer);

		Transfer transfer = new Transfer();
		transfer.setTransferType(oldTransfer.getTransferType());
		transfer.setGridAccount(oldTransfer.getGridAccount());

		if (getInvocationContext().getSharedProperties().get(LOCAL_FILE_NAME) != null) {
			log.info("overriding source file name");
			transfer.setLocalAbsolutePath((String) getInvocationContext()
					.getSharedProperties().get(LOCAL_FILE_NAME));
		} else {
			transfer.setLocalAbsolutePath(oldTransfer.getLocalAbsolutePath());
		}

		if (getInvocationContext().getSharedProperties().get(IRODS_FILE_NAME) != null) {
			log.info("overriding irods file name");
			transfer.setIrodsAbsolutePath((String) getInvocationContext()
					.getSharedProperties().get(IRODS_FILE_NAME));
		} else {
			transfer.setIrodsAbsolutePath(oldTransfer.getIrodsAbsolutePath());
		}

		if (getInvocationContext().getSharedProperties().get(RESOURCE) != null) {
			log.info("overriding resource name");
			transfer.setResourceName((String) getInvocationContext()
					.getSharedProperties().get(RESOURCE));
		} else {
			transfer.setResourceName(oldTransfer.getResourceName());
		}

		log.info("updated transfer is:{}", transfer);
		try {
			getContainerEnvironment()
					.getConveyorService()
					.getQueueManagerService()
					.enqueueTransferOperation(transfer,
							getInvocationContext().getIrodsAccount());

			// add the enqueued transfer to the whiteboard

			getInvocationContext().getSharedProperties().put(ENQUEUED_TRANSFER,
					transfer);

		} catch (RejectedTransferException e) {
			log.error("rejected transfer:{}", transfer, e);
			throw new MicroserviceException("updated transfer was rejected", e);
		} catch (ConveyorExecutionException e) {
			log.error("conveyor exception enqueueing new transfer", e);
			throw new MicroserviceException(
					"conveyor exception enqueueing new transfer", e);
		}

		return ExecResult.CONTINUE;

	}
