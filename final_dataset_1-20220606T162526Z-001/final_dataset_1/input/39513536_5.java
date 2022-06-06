public BioPAXElement create(String localName, String uri)
    {
        Class<? extends BioPAXElement> type = getLevel().getInterfaceForName(localName);
    	return create(type, uri);
    }
