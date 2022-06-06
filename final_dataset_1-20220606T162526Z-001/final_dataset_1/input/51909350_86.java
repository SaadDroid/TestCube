public ListenableFuture<UpdateContextSubscriptionResponse> updateContextSubscription(String url, HttpHeaders httpHeaders, String subscriptionID, UpdateContextSubscription updateContextSubscription) {
        return request(HttpMethod.PUT, url + subscriptionsPath + subscriptionID, httpHeaders, updateContextSubscription, UpdateContextSubscriptionResponse.class);
    }
