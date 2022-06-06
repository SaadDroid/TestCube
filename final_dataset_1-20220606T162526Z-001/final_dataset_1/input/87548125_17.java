@Override
	public void scanModel(final SensorContext context, final ActiveRule rule, final Model<Location> model) {
		final Integer maximum = Integer.valueOf(rule.param(PARAM_MAXIMUM));

		for (final Package<Location> packageToCheck : model.getPackages()) {
			final Set<Class<Location>> classes = packageToCheck.getClasses().stream().filter(Class::isAbstract)
					.collect(Collectors.toSet());
			final int abstractClasses = classes.size();
			final int totalClasses = packageToCheck.getClasses().size();
			final int abstractness = totalClasses == 0 ? 0 : (abstractClasses * 100 / totalClasses);

			LOGGER.debug("Package {}: abstract={}, total={}, abstractness={}", packageToCheck.getName(),
					abstractClasses, totalClasses, abstractness);

			if (abstractness > maximum) {
				registerIssue(context, settings, rule, packageToCheck, classes,
						"Reduce number of abstract classes in this package (allowed: " + maximum + "%, actual: "
								+ abstractness + "%)");
			}
		}
	}
