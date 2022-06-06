@Override
	public void delete(String key) throws BlobNotFoundException, IOException {
		Path fileName = getFileName(key);
		if (!Files.exists(fileName)) {
			throw new BlobNotFoundException(String.format(
					"There is no blob with the key %s", key));
		}
		Files.delete(fileName);
	}
