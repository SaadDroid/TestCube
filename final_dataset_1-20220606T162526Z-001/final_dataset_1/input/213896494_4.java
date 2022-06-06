public Object walletGetRiskLimit() throws ApiException {
        ApiResponse<Object> resp = walletGetRiskLimitWithHttpInfo();
        return resp.getData();
    }
