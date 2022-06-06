public SshConfig parse(String configStr) {
		MutableSshConfig result = new MutableSshConfig();
		for (String line : configStr.split("\n")) {
			line = line.trim();
			String[] splits = line.split("\\s", 2);
			if (splits.length != 2) {
				continue;
			}
			String key = splits[0].trim();
			String value = splits[1].trim();
			if (value.isEmpty()) {
				continue;
			}

			processLine(result, key, value);
		}

		if (result.port == null) {
			result.port = DEFAULT_PORT;
		}
		if (result.host == null) {
			throw new InvalidSshConfigException("HostName is missing");
		}
		if (result.user == null) {
			throw new InvalidSshConfigException("User is missing");
		}
		SshConfig config = new SshConfig(result.host, result.port, result.user);
		if (result.password != null) {
			config = config.withPassword(result.password);
		}
		if (result.keyFile != null) {
			config = config.withKeyFile(result.keyFile);
		}
		if (result.verifyHostKey != null) {
			config = config.withVerifyHostKey(result.verifyHostKey);
		}

		return config;
	}
