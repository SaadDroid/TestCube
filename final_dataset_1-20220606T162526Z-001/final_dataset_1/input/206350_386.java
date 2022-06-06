public static String extractFileExtension(String fileName) {
		int dotInd = fileName.lastIndexOf('.');

		// if dot is in the first position,
		// we are dealing with a hidden file rather than an extension
		return (dotInd > 0 && dotInd < fileName.length()) ? fileName.substring(dotInd + 1) : null;
	}
