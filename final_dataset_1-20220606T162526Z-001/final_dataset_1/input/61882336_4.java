public Map<String, Object> getTaskCounts(String handler, String state) throws ApiException {
        ApiResponse<Map<String, Object>> resp = getTaskCountsWithHttpInfo(handler, state);
        return resp.getData();
    }
