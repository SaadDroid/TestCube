@Override
    public O dispatch(I request) throws Exception {
        log.info("Service dispatch " + this.getClass().getSimpleName() + ". User: " + this.userContext.getCurrentUser()
        + ", Request: " + request);

        if (Server.isInMaintenance()) {
            log.warn("Incoming request (pid:" + ServerUtil.getCurrentPid() + ") while server is in maintenance mode.");
            throw new VmidcException(Server.PRODUCT_NAME + " server is in maintenance mode.");
        }

        if (this.em == null) {
            this.em = getEntityManager();
        }

        TransactionControl txControl = getTransactionControl();

        O response = null;
        try {
            // calling service in a transaction
            response = txControl.required(() -> exec(request, this.em));
        } catch (ScopedWorkException e) {
            handleException(e.getCause());
        }

		ChainedDispatch<O> nextDispatch;
		while ((nextDispatch = popChain()) != null) {
			try {
				final O previousResponse = response;
				final ChainedDispatch<O> tempNext = nextDispatch;
				response = txControl.required(() -> tempNext.dispatch(previousResponse, this.em));
			} catch (ScopedWorkException e) {
				handleException(e.getCause());
			}
		}

        log.info("Service response: " + response);
        return response;
    }
