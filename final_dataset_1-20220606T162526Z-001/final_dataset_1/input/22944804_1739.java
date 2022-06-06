@Override
    protected void afterHandle(Request request, Response response) {
        if (response.getStatus().isError() && response.getEntity() == null) {
            if (405 == response.getStatus().getCode()) {
                response.setEntity(jacksonRepresentationFactory.create(UNSUPPORTED_METHOD_TYPE));
            } else if (412 == response.getStatus().getCode()) {
                response.setEntity(jacksonRepresentationFactory.create(PRECONDITION_FAILED));
            } else if (response.getStatus().getThrowable() instanceof OAuth2Exception) {
                OAuth2Exception exception = (OAuth2Exception) response.getStatus().getThrowable();
                setExceptionResponse(response, exception.getStatusCode(), exception.getError());
            } else {
                setExceptionResponse(response, 500, "server_error");
            }
        }
    }
