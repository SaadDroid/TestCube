public ListenableFuture<UpdateContextElementResponse> updateContextElement(String url, HttpHeaders httpHeaders, String entityID, UpdateContextElement updateContextElement) {
        return request(HttpMethod.PUT, url + entitiesPath + entityID, httpHeaders, updateContextElement, UpdateContextElementResponse.class);
    }
