public void inject(InjectionDetails injectionDetails) {
		for (Object injectCollections : injectionDetails.getInjectCollections()) {
			inject(injectCollections, injectionDetails.getMocks(), injectionDetails.getInjectableCollectionSet(),
					injectCollections.getClass());
		}
	}
