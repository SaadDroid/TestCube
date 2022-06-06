@Override
	public void publishResource(Name<?> resourceName, Class<? extends ResourceHandler> handlerClass, String path) {
		RootResource rootResource = new RootResource(resourceName,handlerClass,path);
		this.candidates.add(rootResource);
	}
