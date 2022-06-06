@Override
	public String put(byte[] data) throws IOException {
		Files.createDirectories(getRoot());
		String key = createNewKey();
		Files.write(getFileName(key), data);
		return key;
	}
