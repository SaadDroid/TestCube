public AggregationResponse readAggregationResponse(KSIRequestContext context, ServiceCredentials credentials, TLVElement input) throws KSIException {
        return this.aggregatorPduV2Factory.readAggregationResponse(context, credentials, input);
    }
