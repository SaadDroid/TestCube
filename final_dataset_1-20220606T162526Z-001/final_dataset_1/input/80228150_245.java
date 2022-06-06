static List<Requirement> parseRequireBundle(String header) throws IllegalArgumentException {
		if (header == null) {
            return Collections.emptyList();
        }

		Clause[] clauses = Parser.parseHeader(header);
		List<Requirement> requirements = new ArrayList<>(clauses.length);
		for (Clause requireClause : clauses) {
			String bsn = requireClause.getName();
			String versionRangeStr = requireClause.getAttribute(org.osgi.framework.Constants.BUNDLE_VERSION_ATTRIBUTE);

			String filter = toBundleFilter(bsn, versionRangeStr);
			Requirement requirement = new RequirementBuilderImpl(BundleNamespace.BUNDLE_NAMESPACE)
				.addDirective(Namespace.REQUIREMENT_FILTER_DIRECTIVE, filter)
				.build();
			requirements.add(requirement);
		}
		return requirements;
	}
