public void validateRequest(OAuth2Request request) throws InvalidClientException, InvalidRequestException,
            RedirectUriMismatchException, UnsupportedResponseTypeException, ServerException, NotFoundException {

        Reject.ifTrue(isEmpty(request.<String>getParameter(CLIENT_ID)), "Missing parameter, 'client_id'");
        Reject.ifTrue(isEmpty(request.<String>getParameter(RESPONSE_TYPE)), "Missing parameter, 'response_type'");

        final ClientRegistration clientRegistration = clientRegistrationStore.get(request.<String>getParameter("client_id"),
                request);

        if (request.getParameter(OAuth2Constants.DeviceCode.USER_CODE) == null) {
            redirectUriValidator.validate(clientRegistration, request.<String>getParameter(REDIRECT_URI));
        }

        responseTypeValidator.validate(clientRegistration,
                splitResponseType(request.<String>getParameter(RESPONSE_TYPE)), providerSettingsFactory.get(request));
    }
