@Override
	public ExecutionResult tryExecute(Path workingDirectory, String... cmd) throws IOException {
		String workdir = workingDirectory == null ? null : workingDirectory.toString();
		return tryExecuteIn(workdir, cmd);
	}
