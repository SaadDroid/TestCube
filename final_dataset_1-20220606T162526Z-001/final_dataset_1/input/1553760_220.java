protected void ensureFolderExists(String name, File folder, boolean createIfMissing) {
		if (folder.exists()) {
			if (!folder.isDirectory()) {
				throw new BuildFailureException(format("{0} exists but is not a folder: {1}", name, folder));
			}
			return;
		}
		if (!createIfMissing) {
			throw new BuildFailureException(format("{0} does not exist: {1}", name, folder));
		}
		if (!folder.mkdirs()) {
			throw new BuildFailureException(format("Cannot create {0}: {1}", name, folder));
		}
	}
