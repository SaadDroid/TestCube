public Object conditionalGetOrders(String stopOrderId, String orderLinkId, String symbol, String order, BigDecimal page, BigDecimal limit) throws ApiException {
        ApiResponse<Object> resp = conditionalGetOrdersWithHttpInfo(stopOrderId, orderLinkId, symbol, order, page, limit);
        return resp.getData();
    }
