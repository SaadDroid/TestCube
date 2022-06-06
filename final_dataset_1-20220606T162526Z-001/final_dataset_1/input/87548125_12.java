@Override
	public void scanModel(final SensorContext context, final ActiveRule rule, final Model<Location> model) {
		for (final Package<Location> packageToCheck : model.getPackages()) {
			LOGGER.debug("Package {}: extenal={}", packageToCheck.getExternal());

			if (packageToCheck.getExternal() == null) {
				for (final Class<Location> classToReport : packageToCheck.getClasses()) {
					registerIssue(context, rule, classToReport, "Add a package-info.java to the package.");
				}
			}
		}
	}
