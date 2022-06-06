@Override
	public void scanModel(final SensorContext context, final ActiveRule rule, final Model<Location> model) {
		final Integer maximum = Integer.valueOf(rule.param(PARAM_MAXIMUM));

		for (final Package<Location> packageToCheck : model.getPackages()) {
			final int classcount = packageToCheck.getClasses().size();

			LOGGER.debug("Package {}: total={}", packageToCheck.getName(), classcount);

			if (classcount > maximum) {
				registerIssue(context, settings, rule, packageToCheck, packageToCheck.getClasses(),
						"Reduce number of classes in package (allowed: " + maximum + ", actual: " + classcount + ")");
			}
		}
	}
