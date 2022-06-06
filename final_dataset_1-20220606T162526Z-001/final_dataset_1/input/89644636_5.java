public byte[] getModel(String  modelUri) {
		return getModel(new DefaultResourceLoader().getResource(modelUri));
	}
