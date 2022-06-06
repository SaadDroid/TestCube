@Override
    protected <T> void doExecute(SelectContext<T> context) {

        super.doExecute(context);

        Map<String, List<String>> protocolParameters = context.getProtocolParameters();

        // TODO: make symmetrical with AgRequestBuilder (namely hide the parser inside the builder)
        //  Or even better - convert "filter" to CayenneExp and avoid this SenchaRequest buisness all together
        SenchaRequest.Builder builder = SenchaRequest.builder()
                .filters(filterParser.fromString(ParameterExtractor.string(protocolParameters, FILTER)));

        SenchaRequest.set(context, builder.build());
    }
