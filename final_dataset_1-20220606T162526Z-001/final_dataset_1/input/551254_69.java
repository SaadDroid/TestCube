private static NamespaceContextImpl getNamespaceMap(XmlObject object) {
		Map<String, String> namespaces = getNamespaceMap(object.getDomNode());
		
		NamespaceContextImpl result = new NamespaceContextImpl();
		
		for(Entry<String, String> namespaceEntry : namespaces.entrySet()) {
			result.setNamespace(namespaceEntry.getKey(), namespaceEntry.getValue());
		}
		
		return result;
	}
