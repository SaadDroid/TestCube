public Collection<PredefinedPendingAttributesForView> getViewMappings(Context context) {
		return new ItemMappingParser().parse(getName(), attributeValue, context).getPredefinedPendingAttributesForViewGroup();
	}
