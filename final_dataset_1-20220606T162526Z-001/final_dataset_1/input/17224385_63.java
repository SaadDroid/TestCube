@Override
	public ExecResult execute(final TransferStatus transferStatus)
			throws MicroserviceException {

		log.info("execute");

		String bundleToExtract = (String) getInvocationContext()
				.getSharedProperties().get(BUNDLE_TO_EXTRACT);
		if (bundleToExtract == null || bundleToExtract.isEmpty()) {
			log.info("did not find BUNDLE_TO_EXTRACT, look at transfer status value");
			bundleToExtract = transferStatus.getTargetFileAbsolutePath();
			File sourceFile = new File(
					transferStatus.getSourceFileAbsolutePath());
			StringBuilder sb = new StringBuilder();
			sb.append(bundleToExtract);
			sb.append("/");
			sb.append(sourceFile.getName());
			bundleToExtract = sb.toString();

			if (bundleToExtract == null || bundleToExtract.isEmpty()) {
				log.error("no bundle to extract found");
				throw new MicroserviceException(
						"missing BUNDLE_TO_EXTTRACT value");
			}
		}

		log.info("bundle to extract:{}", bundleToExtract);

		IRODSFile targetFile = null;
		try {
			targetFile = getContainerEnvironment()
					.getConveyorService()
					.getIrodsAccessObjectFactory()
					.getIRODSFileFactory(
							getInvocationContext().getIrodsAccount())
					.instanceIRODSFile(bundleToExtract);
		} catch (JargonException e1) {
			log.error("jargon error getting target file");
			throw new MicroserviceException();
		}

		log.info("target file:{}", targetFile);

		if (targetFile.exists() && targetFile.isDirectory()) {
			log.error("bundle file not in iRODS");
			throw new MicroserviceException();
		}

		log.info("look for target");

		String targetCollection = (String) getInvocationContext()
				.getSharedProperties().get(TARGET_COLLECTION);

		if (targetCollection == null || targetCollection.isEmpty()) {
			log.info("no target collection passed in, use the parent of the tar file");
			targetCollection = targetFile.getParent();
		}

		log.info("target collection will be:{}", targetCollection);

		log.info("getting resource");
		String targetResource = (String) getInvocationContext()
				.getSharedProperties().get(TARGET_RESOURCE);

		if (targetResource == null) {
			targetResource = "";
		}

		log.info("setting target resource:{}", targetResource);

		log.info("ok have everything set let's uncompress the tar by calling iRODS");

		try {
			BulkFileOperationsAO bulkFileOperations = getContainerEnvironment()
					.getConveyorService()
					.getIrodsAccessObjectFactory()
					.getBulkFileOperationsAO(
							getInvocationContext().getIrodsAccount());

			bulkFileOperations.extractABundleIntoAnIrodsCollection(
					bundleToExtract, targetCollection, targetResource);
			log.info("complete");
			return ExecResult.CONTINUE;

		} catch (JargonException e) {
			log.error("unable to unbundle file", e);
			throw new MicroserviceException(
					"unable to unbundle file due to jargon errors", e);
		}

	}
