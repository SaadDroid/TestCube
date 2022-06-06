@Override
    public Response urlValidate(Map<String, Object> asset, String field) {
	   IURLManager urlManager = getURLManager(getProvider(asset));
	   Map<String, Object> fieldMap = urlManager.validateURL(getUrl(asset), field);
	   Response response = new Response();
       response.getResult().put(field, fieldMap);
       return response;
    }
