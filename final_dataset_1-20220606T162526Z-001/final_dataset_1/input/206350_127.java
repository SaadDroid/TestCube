public void execute() throws Exception {

		validateAttributes();

		try {
			for (Artifact artifact : cgenConfiguration.getArtifacts()) {
				execute(artifact);
			}
		} finally {
			// must reset engine at the end of class generator run to avoid
			// memory
			// leaks and stale templates
			templateCache.clear();
		}
	}
