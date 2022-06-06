public static MarketDataSpecification buildSpecification(String json) throws JSONException {
    return buildSpecification(new JSONObject(json));
  }
