public void validate(ClientRegistration clientRegistration, Set<String> requestedResponseTypes,
            OAuth2ProviderSettings providerSettings) throws InvalidRequestException, UnsupportedResponseTypeException,
            ServerException {

        if (requestedResponseTypes == null || requestedResponseTypes.isEmpty()) {
            throw new UnsupportedResponseTypeException("Response type is not supported.");
        }

        final UrlLocation urlLocation = Utils.getRequiredUrlLocation(requestedResponseTypes, clientRegistration);
        final Map<String, ResponseTypeHandler> allowedResponseTypes = providerSettings.getAllowedResponseTypes();

        if (allowedResponseTypes == null || allowedResponseTypes.isEmpty()) {
            throw new InvalidRequestException("Invalid Response Type.", urlLocation);
        }

        if (!allowedResponseTypes.keySet().containsAll(requestedResponseTypes)) {
            throw new UnsupportedResponseTypeException("Response type is not supported.", urlLocation);
        }

        //requested response type comes in as 'id_token token' (for example) and split into 'id_token' and 'token'
        //provider response types are as 'id_token token', 'token', 'id_token' - those with spaces must be split
        //and compared in any order. A provider must specify all response types for a client in one string.
        final Set<String> clientAllowedResponseTypes = clientRegistration.getAllowedResponseTypes();
        boolean cleared = false;
        for (String clientAllowedResponseType : clientAllowedResponseTypes) {
            if (Utils.splitResponseType(clientAllowedResponseType).containsAll(requestedResponseTypes) &&
                    Utils.splitResponseType(clientAllowedResponseType).size() == requestedResponseTypes.size()) {
                cleared = true;
                break;
            }
        }

        if (!cleared) {
            throw new UnsupportedResponseTypeException("Client does not support this response type.", urlLocation);
        }

        validateForOAuth2(clientRegistration, requestedResponseTypes);
        validateForOpenIdConnect(clientRegistration, requestedResponseTypes);

    }
