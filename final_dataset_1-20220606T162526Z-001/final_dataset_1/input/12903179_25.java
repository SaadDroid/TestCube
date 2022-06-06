@Override
	public void execute() {
		if (!isExecutable()) {
			throw new RuntimeException("The execute()-method of the command was called while it wasn't executable.");
		} else {
			if (inBackground) {
				super.restart();
			} else {
				// When the command is not executed in background, we have to imitate a service execution, so the
				// service statemachine provides the
				// correct service state to the command.
				callActionAndSynthesizeServiceRun();
			}
		}
	}
