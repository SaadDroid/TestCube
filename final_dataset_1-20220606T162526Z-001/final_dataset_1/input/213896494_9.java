public Object fundingPredictedRate(String symbol) throws ApiException {
        ApiResponse<Object> resp = fundingPredictedRateWithHttpInfo(symbol);
        return resp.getData();
    }
