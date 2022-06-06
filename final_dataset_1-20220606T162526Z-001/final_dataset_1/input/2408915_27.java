public InflatedViewWithRoot inflateView(int layoutId) {
		resolvedBindingAttributesForChildViews = Lists.newArrayList();
		errors = new ViewHierarchyInflationErrorsException();

		View rootView = nonBindingViewInflater.inflateWithoutRoot(layoutId);

		return createInflatedViewWithRoot(rootView);
	}
