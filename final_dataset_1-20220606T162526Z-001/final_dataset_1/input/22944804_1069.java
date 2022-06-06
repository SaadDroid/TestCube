public Map<String, Object> evaluateScope(AccessToken accessToken) {
        final Map<String, Object> map = new HashMap<String, Object>();
        final Set<String> scopes = accessToken.getScope();

        if (scopes.isEmpty()) {
            return map;
        }

        final String resourceOwner = accessToken.getResourceOwnerId();
        final String clientId = accessToken.getClientId();
        final String realm = accessToken.getRealm();

        AMIdentity id = null;
        try {
            if (clientId != null && CLIENT_CREDENTIALS.equals(accessToken.getGrantType()) ) {
                id = identityManager.getClientIdentity(clientId, realm);
            } else if (resourceOwner != null) {
                id = identityManager.getResourceOwnerIdentity(resourceOwner, realm);
            }
        } catch (Exception e) {
            logger.error("Unable to get user identity", e);
        }
        if (id != null) {
            for (String scope : scopes) {
                try {
                    Set<String> attributes = id.getAttribute(scope);
                    StringBuilder builder = new StringBuilder();
                    if (CollectionUtils.isNotEmpty(attributes)) {
                        Iterator<String> iter = attributes.iterator();
                        while (iter.hasNext()) {
                            builder.append(iter.next());
                            if (iter.hasNext()) {
                                builder.append(MULTI_ATTRIBUTE_SEPARATOR);
                            }
                        }
                    }
                    map.put(scope, builder.toString());
                } catch (Exception e) {
                    logger.error("Unable to get attribute", e);
                }
            }
        }

        return map;
    }
