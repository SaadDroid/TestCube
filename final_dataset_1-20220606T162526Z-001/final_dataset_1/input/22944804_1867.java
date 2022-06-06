public void validateRequest(OAuth2Request request) throws BadRequestException, InvalidRequestException,
            InvalidClientException, InvalidScopeException, NotFoundException {

        validateOpenIdScope(request);

        try {
            OpenIdPrompt prompt = new OpenIdPrompt(request);
            Reject.ifFalse(prompt.isValid(), "Prompt parameter " + prompt.getOriginalValue() +
                    " is invalid or unsupported");
        } catch (IllegalArgumentException e) {
            throw new BadRequestException(e.getMessage());
        }
    }
