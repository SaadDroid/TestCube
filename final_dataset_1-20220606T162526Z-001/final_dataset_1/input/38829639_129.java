static Map<String, Object> refreshOidcToken(OkHttpClient client, String clientId, String refreshToken, String clientSecret, String tokenURL) throws IOException {
    try (Response response = client.newCall(getTokenRefreshHttpRequest(tokenURL, clientId, refreshToken, clientSecret)).execute()) {
      String responseBody;
      if (response.body() != null) {
        // Get response body as string
        responseBody = response.body().string();
        if (response.isSuccessful()) {
          // Deserialize response body into a Map and return
          return convertJsonStringToMap(responseBody);
        } else {
          // Log error response body
          LOGGER.warn("Response: {}", responseBody);
        }
      }
    }
    return Collections.emptyMap();
  }
