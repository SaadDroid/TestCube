@Override
	public boolean accept(File f) {
		if (f == null) {
			return false;
		}
		if (f.isDirectory()) {
			return true;
		}
		String ext = getExtension(f).toLowerCase();
		for (String extension : capabilities.getExtensions()) {
			if (extension.equals(ext)) {
				return true;
			}
		}
		return false;
	}
