public void execute() {
		if (exportCfgTask != null) {
			exportCfgTask.getProperties().put(
					ExporterConstants.METADATA_DESCRIPTOR, 
					metadataTask.createMetadataDescriptor());
			exportCfgTask.execute();
		}
	}
