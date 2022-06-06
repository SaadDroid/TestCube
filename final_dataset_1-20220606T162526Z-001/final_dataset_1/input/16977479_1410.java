public static <T extends Throwable> Response convertFaultToResponse(T ex, Message currentMessage) {
        if (ex == null || currentMessage == null) {
            return null;
        }
        Message inMessage = currentMessage.getExchange().getInMessage();
        Response response = null;
        if (ex instanceof WebApplicationException) {
            WebApplicationException webEx = (WebApplicationException)ex;
            if (webEx.getResponse().hasEntity()
                && webEx.getCause() == null
                && MessageUtils.getContextualBoolean(inMessage, SUPPORT_WAE_SPEC_OPTIMIZATION, true)) {
                response = webEx.getResponse();
            }
        }

        if (response == null) {
            ExceptionMapper<T>  mapper =
                ServerProviderFactory.getInstance(inMessage).createExceptionMapper(ex.getClass(), inMessage);
            if (mapper != null) {
                try {
                    response = mapper.toResponse(ex);
                } catch (Throwable mapperEx) {
                    inMessage.getExchange().put(JAXRSUtils.EXCEPTION_FROM_MAPPER, "true");
                    mapperEx.printStackTrace();
                    return Response.serverError().build();
                }
            }
        }
        if (response == null) {
            Throwable unwrappedException = ex.getCause();
            if (unwrappedException instanceof WebApplicationException) {
                WebApplicationException webEx = (WebApplicationException)unwrappedException;
                response = webEx.getResponse();
            }
        }
        JAXRSUtils.setMessageContentType(currentMessage, response);
        return response;
    }
