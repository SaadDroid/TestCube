@Override
    protected Response handleErrorResponse(Request request, Status status, Exception exception) {
        Reject.ifNull(status);
        Response response = new Response(status);
        if (exception instanceof RestAuthResponseException) {
            final RestAuthResponseException authResponseException = (RestAuthResponseException)exception;
            for (Map.Entry<String, String> entry : authResponseException.getResponseHeaders().entrySet()) {
                response.getHeaders().add(entry.getKey(), entry.getValue());
            }
            response.setEntity(authResponseException.getJsonResponse().asMap());
            return response;

        } else if (exception instanceof RestAuthException) {
            final RestAuthException rae = (RestAuthException)exception;
            ResourceException cause = ResourceException.getException(rae.getStatusCode(), getLocalizedMessage(request, rae));

            if (rae.getFailureUrl() != null) {
                cause.setDetail(json(object(field("failureUrl", rae.getFailureUrl()))));
            }

            return createExceptionResponse(response, cause);

        } else if (exception == null) {
            return createExceptionResponse(response, ResourceException.getException(status.getCode()));

        } else {
            return createExceptionResponse(response, ResourceException.getException(status.getCode(), exception.getMessage(), exception));
        }
    }
