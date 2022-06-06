public static String[] getDataTypeURIs(String datatypeKey)
    {
       	Set<String> alluris = new HashSet<String>();
    	Datatype datatype = getDatatype(datatypeKey);
    	for(Uris uris : datatype.getUris()) {
    		for(Uri uri : uris.getUri()) {
    			alluris.add(uri.getValue());
    		}
    	}
    	return alluris.toArray(ARRAY_OF_STRINGS);
    }
