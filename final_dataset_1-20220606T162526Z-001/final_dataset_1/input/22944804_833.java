public boolean isRestricted(SSOToken token) throws SessionException {
        Reject.ifNull(token);

        if (!factory.containsJwt(token.toString())) {
            throw new SessionException("Not a Stateless Session");
        }

        try {
            return isRestricted(token.getPrincipal().getName());
        } catch (SSOException e) {
            throw new SessionException(e);
        }
    }
