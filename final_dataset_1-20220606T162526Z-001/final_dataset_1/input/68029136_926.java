protected static AMW_STM createSTMbasedOnArgs(String[] args) {
		AMW_STM stm = new AMW_STM();
		// Read configurations
		if (args.length > 0) {
			stm.pathToSTPs = args[0];
		}
		if (args.length > 1) {
			if (DEPENDENCY_MANAGEMENT_ARGUMENT_STRING.equals(args[1])) {
				stm.dependencyManagement = true;
			}
			else {
				stm.numberOfThreads = Integer.parseInt(args[1]);
			}
			// dependencyManagement false and arg[2] is set
			if (!stm.dependencyManagement && args.length > 2) {
				stm.testTimeout = Integer.parseInt(args[2]);
			}
		}
		return stm;
	}
