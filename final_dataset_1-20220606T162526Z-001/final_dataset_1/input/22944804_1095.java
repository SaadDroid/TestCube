private List<String[]> getDisplayName(String attributeName) {
        try {
            Set<String> displayName = amIdentity.getAttribute(attributeName);
            return splitPipeDelimited(convertAttributeValues(displayName), "name").get("name");
        } catch (Exception e){
            logger.error("Unable to get {} from repository", OAuth2Constants.OAuth2Client.NAME, e);
            throw OAuthProblemException.OAuthError.SERVER_ERROR.handle(Request.getCurrent(),
                    "Unable to get "+ OAuth2Constants.OAuth2Client.NAME +" from repository");
        }
    }
