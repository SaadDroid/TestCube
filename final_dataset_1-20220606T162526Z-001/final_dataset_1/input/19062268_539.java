public synchronized WriteSession createSession() throws ApplicationContextException {
		if(this.threadSession.containsKey(Thread.currentThread().getId())) {
			throw failure("Thread already has an active session");
		}

		if(this.delegate.isOffline()) {
			throw failure("The Application Engine is off-line");
		}

		WriteSession nativeSession=this.delegate.createSession();
		if(nativeSession==null) {
			throw failure("Could not create native write session");
		}

		setUpWriteSessionCleaner();

		return
			trackSession(
				new ContextWriteSessionState(
					nativeSession,
					new CleanerContextWriteSessionStateListener()));
	}
