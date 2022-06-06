@Override
    protected int beforeHandle(Request request, Response response) {
        ChallengeResponse challengeResponse = request.getChallengeResponse();
        Status failure = null;
        if (challengeResponse == null) {
            failure = new Status(401, new InvalidTokenException());
        } else {
            String tokenId = challengeResponse.getRawValue();
            try {
                OAuth2Request oAuth2Request = requestFactory.create(request);
                AccessToken accessToken = tokenStore.readAccessToken(oAuth2Request, tokenId);
                if (accessToken == null || accessToken.isExpired()) {
                    failure = new Status(401, new InvalidTokenException());
                } else if (requiredScope != null && !accessToken.getScope().contains(requiredScope)) {
                    failure = new Status(403, new InsufficientScopeException(requiredScope));
                } else {
                    oAuth2Request.setToken(AccessToken.class, accessToken);
                }
            } catch (ServerException e) {
                failure = new Status(500, e);
            } catch (NotFoundException e) {
                debug.message("Error loading token with id: " + tokenId, e);
                failure = new Status(404, e);
            } catch (InvalidGrantException e) {
                debug.message("Error loading token with id: " + tokenId, e);
                failure = new Status(401, new InvalidTokenException());
            }
        }
        if (failure != null) {
            response.setStatus(failure);
            return STOP;
        }
        return super.beforeHandle(request, response);
    }
