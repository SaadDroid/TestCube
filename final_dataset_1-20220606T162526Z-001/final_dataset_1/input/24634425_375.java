public static String getRootCollectionJSON(List<Provider> providers) {
		Collection collection = prepareCollection(providers);
		
		return toJSON(Collection.class, collection);
	}
