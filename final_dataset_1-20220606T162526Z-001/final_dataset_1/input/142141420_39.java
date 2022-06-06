@Override
   public Response metadataRead(Map<String, Object> asset) {
	   IURLManager urlManager = getURLManager(getProvider(asset));
       String url = getUrl(asset);
       Map<String, Object> metadata = urlManager.readMetadata(url);
       Response response = new Response();
       response.getResult().put("metadata", metadata);
       return response;
   }
