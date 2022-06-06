public static URIDescriptor create(URI target) {
		if(target==null) {
			throw new NullPointerException("URI cannot be null");
		}
		if(target.isOpaque()) {
			throw new IllegalArgumentException("URI must be hierarchical");
		}
		URI targetDir = target.resolve(".");
		String targetFile=target.getPath().substring(targetDir.getPath().length());
		String targetQuery = target.getQuery();
		String targetFragment=target.getFragment();
		return new URIDescriptor(target,targetDir.getPath(),targetFile,targetQuery,targetFragment);
	}