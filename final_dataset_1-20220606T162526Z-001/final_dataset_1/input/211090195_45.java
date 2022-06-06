public Token deserialize(JSONObject response) throws JSONException {
        Token token = new Token();
        token.setToken(response.getString("token"));
        return token;
    }
