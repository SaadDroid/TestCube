public List<AreaRenderer> getAreaRenderers(DataSource s) {
		List<AreaRenderer> areaRenderers = areaRenderersByDataSource.get(s);
		if (areaRenderers != null) {
			return Collections.unmodifiableList(areaRenderers);
		}
		return Collections.emptyList();
	}
