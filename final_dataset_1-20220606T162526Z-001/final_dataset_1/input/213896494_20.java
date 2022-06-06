public Object symbolGet() throws ApiException {
        ApiResponse<Object> resp = symbolGetWithHttpInfo();
        return resp.getData();
    }
