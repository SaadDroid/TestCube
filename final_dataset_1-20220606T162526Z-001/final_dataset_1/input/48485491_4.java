@Override
    public void filterRequest(Request request, Response response) throws InternalErrorException, BadRequestException, ProcessingException {
        PoseidonRequest poseidonRequest = (PoseidonRequest) request;
        Map<String, Object> parsedParams = new HashMap<>();
        if (params != null) {
            parsedParams.putAll(validateParams(poseidonRequest, params.getRequired(), true));
            parsedParams.putAll(validateParams(poseidonRequest, params.getOptional(), false));
        }
        poseidonRequest.setAttribute(RequestConstants.PARAMS, parsedParams);
    }
