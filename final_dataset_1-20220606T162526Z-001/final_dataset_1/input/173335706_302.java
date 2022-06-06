protected RequestBuilder createRequestBuilder() {
        if (httpParameters.getHttpMethod().equals(HttpMethod.GET)) {
            return RequestBuilder.get();
        } else if (httpParameters.getHttpMethod().equals(HttpMethod.POST)) {
            return RequestBuilder.post();
        } else if (httpParameters.getHttpMethod().equals(HttpMethod.HEAD)) {
            return RequestBuilder.head();
        } else if (httpParameters.getHttpMethod().equals(HttpMethod.PUT)) {
            return RequestBuilder.put();
        } else if (httpParameters.getHttpMethod().equals(HttpMethod.DELETE)) {
            return RequestBuilder.delete();
        } else {
            return null;
        }
    }
