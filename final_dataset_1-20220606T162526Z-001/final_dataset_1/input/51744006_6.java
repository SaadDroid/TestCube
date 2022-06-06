public ListenableFuture<Map<String, String>> getV2() {
        ListenableFuture<ResponseEntity<JsonNode>> responseFuture = request(HttpMethod.GET, baseURL + "v2", null, JsonNode.class);
        return new ListenableFutureAdapter<Map<String, String>, ResponseEntity<JsonNode>>(responseFuture) {
            @Override
            protected Map<String, String> adapt(ResponseEntity<JsonNode> result) throws ExecutionException {
                Map<String, String> services = new HashMap<>();
                result.getBody().fields().forEachRemaining(entry -> services.put(entry.getKey(), entry.getValue().textValue()));
                return services;
            }
        };
    }
