public AuthConfig extendedAuth(AuthConfig localCredentials) throws IOException {
        JsonObject jo = getAuthorizationToken(localCredentials);

        JsonArray authorizationDatas = jo.getAsJsonArray("authorizationData");
        JsonObject authorizationData = authorizationDatas.get(0).getAsJsonObject();
        String authorizationToken = authorizationData.get("authorizationToken").getAsString();

        return new AuthConfig(authorizationToken, "none");
    }
