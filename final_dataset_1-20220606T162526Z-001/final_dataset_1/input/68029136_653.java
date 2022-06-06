protected synchronized void executeForTests() {
		log.log(Level.FINE, "Checking for tests");
		List<ShakedownTestEntity> tests = shakedownTestService.getTestsToExecute();
		if (!tests.isEmpty()) {
			log.log(logLevel, tests.size() + " tests found");
			doTesting(tests);
		}
		else {
			log.log(Level.FINE, "No tests found");
		}
	}
