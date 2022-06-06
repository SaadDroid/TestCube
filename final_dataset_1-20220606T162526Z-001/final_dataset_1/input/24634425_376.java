public static String getRootCollectionXML(List<Provider> providers) {
		Collection collection = prepareCollection(providers);
		
		return toXML(Collection.class, collection);
	}
