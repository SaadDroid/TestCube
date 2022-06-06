public SshConfig getSshConfig(Node node) throws IOException {
		Path nodePath = getPath(node);
		String sshConfigStr = executor.execute(nodePath, "vagrant", "ssh-config").getOutput();
		try {
			return sshConfigParser.parse(sshConfigStr);
		} catch (InvalidSshConfigException e) {
			throw new IOException("Vagrant reported invalid ssh config: " + sshConfigStr, e);
		}
	}
