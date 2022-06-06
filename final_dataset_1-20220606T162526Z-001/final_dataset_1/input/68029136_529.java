public static ResourceEntity createNewResource(String name){
		return createNewResourceForOwner(name, ForeignableOwner.getSystemOwner());
	}
