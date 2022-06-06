public Object fundingGetRate(String symbol) throws ApiException {
        ApiResponse<Object> resp = fundingGetRateWithHttpInfo(symbol);
        return resp.getData();
    }
