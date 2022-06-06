private static byte[] loadResource(@NotNull InputStream stream) throws IOException {
		// reading file as resource
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] buffer = new byte[4096];
			int size;
			while ((size = stream.read(buffer)) != -1) {
				out.write(buffer, 0, size);
			}
			return out.toByteArray();
		} finally {
			stream.close();
		}
	}
