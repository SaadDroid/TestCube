public Object positionsTradingStop(String symbol, String takeProfit, String stopLoss, String trailingStop) throws ApiException {
        ApiResponse<Object> resp = positionsTradingStopWithHttpInfo(symbol, takeProfit, stopLoss, trailingStop);
        return resp.getData();
    }
