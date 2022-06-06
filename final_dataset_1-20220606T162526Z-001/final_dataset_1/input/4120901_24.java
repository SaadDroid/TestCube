public static String[] getWorkflowDescriptor(File workflowArtifactFolder) {
		String result[] = null;
		if (!workflowArtifactFolder.exists()) {
			return result;
		}

		File[] xmlFiles = workflowArtifactFolder.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.toLowerCase().endsWith(".xml");
			}

		});

		File[] propertiesFiles = workflowArtifactFolder.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.toLowerCase().endsWith(".properties");
			}

		});

		if (xmlFiles != null && xmlFiles.length == 1 && propertiesFiles != null && propertiesFiles.length == 1) {
			result = new String[2];
			result[0] = xmlFiles[0].getAbsolutePath();
			result[1] = propertiesFiles[0].getAbsolutePath();
		}
		else {
			logger.warn("uploaded workflow descriptor is incorrect");
		}
		return result;
	}
