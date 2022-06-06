@Deprecated
    public Object orderCancel(String orderId, String symbol) throws ApiException {
        ApiResponse<Object> resp = orderCancelWithHttpInfo(orderId, symbol);
        return resp.getData();
    }
