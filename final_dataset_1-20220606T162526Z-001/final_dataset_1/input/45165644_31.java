@Override
    public ApiGatewayResponse handleRequest(Map<String, Object> input, Context context) {
        BasicConfigurator.configure();
        LOG.info("received: " + input);

        return new ApiGatewayResponse
                .ApiGatewayResponseBuilder<LambdaInfo>()
                .headers(headers())
                .statusCode(SUCCESS_STATUS_CODE)
                .body(lambdaInfo(context))
                .build();

    }
