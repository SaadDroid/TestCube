public RoutingRequestBuilder setStartTime(long startTime) {
        routingRequest.dateTime = startTime;
        routingRequest.setArriveBy(false);
        return this;
    }
