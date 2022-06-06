@Override
	public ExecutionResult tryExecute(Path workingDirectory, String... cmd) throws IOException {
		logger.debug("Executing `" + StringUtils.join(cmd, ' ') + " in " + workingDirectory);
		File workdir = workingDirectory == null ? null : workingDirectory.toFile();
		Process process = Runtime.getRuntime().exec(cmd, null, workdir);
		String stdout = IOUtils.toString(process.getInputStream());
		String stderr = IOUtils.toString(process.getErrorStream());
		try {
			process.waitFor();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new IOException("Thread was interrupted before command finished", e);
		}
		int exitCode = process.exitValue();
		return new ExecutionResult(exitCode, stdout, stderr);
	}
