public static RequestSpecification build(HttpRequest request){
		if(request == null) return null;

		RequestSpecBuilder reqSpecBuilder = new RequestSpecBuilder();

		//inject http protocal into host
		try {

			if(!request.getHost().getValue().toUpperCase().startsWith("HTTP://") && !request.getHost().getValue().toUpperCase().startsWith("HTTPS://")){
				request.setHost(new Host("http://"+request.getHost().getValue()));
			}

			URL url = new URL(request.getHost().getValue());
			if(!Optional.ofNullable(url.getProtocol()).isPresent()){
				String host = Optional.ofNullable(request.getProtocal()).map(HttpProtocal::name).orElse(HttpProtocal.HTTP.name()) + request.getHost().getValue();
				request.setHost(new Host(host));
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		Optional.ofNullable(request.getHeaders()).map(RestAssuredRequestBuilder::mapHeaders).ifPresent(reqSpecBuilder::addHeaders);
		Optional.ofNullable(request.getQueryParams()).map(RestAssuredRequestBuilder::mapQueryParams).ifPresent(reqSpecBuilder::addQueryParams);
		Optional.ofNullable(request.getPathParams()).map(RestAssuredRequestBuilder::mapPathParams).ifPresent(reqSpecBuilder::addPathParams);
		Optional.ofNullable(request.getCookies()).map(RestAssuredRequestBuilder::mapCookies).ifPresent(reqSpecBuilder::addCookies);
		Optional.ofNullable(request.getForms()).map(RestAssuredRequestBuilder::mapForms).ifPresent(reqSpecBuilder::addFormParams);
		Optional.ofNullable(request.getBody()).map(RestAssuredRequestBuilder::mapBody).ifPresent(reqSpecBuilder::setBody);
		Optional.ofNullable(request.getAuthentication()).map(RestAssuredRequestBuilder::mapAuthentication).ifPresent(reqSpecBuilder::setAuth);
		Optional.ofNullable(request.getHost()).map(RestAssuredRequestBuilder::mapHost).ifPresent(reqSpecBuilder::setBaseUri);
		Optional.ofNullable(request.getPort()).ifPresent(reqSpecBuilder::setPort);
		Optional.ofNullable(request.getServicePath()).map(RestAssuredRequestBuilder::mapServicePath).ifPresent(reqSpecBuilder::setBasePath);
		Optional.ofNullable(request.getMultiParts()).ifPresent(x -> x.stream().forEach( part -> reqSpecBuilder.addMultiPart(mapMultiPart(part))));



		reqSpecBuilder.log(LogDetail.ALL);
//		reqSpecBuilder.addFilter(new ResponseLoggingFilter());

		return reqSpecBuilder.build();
	}
