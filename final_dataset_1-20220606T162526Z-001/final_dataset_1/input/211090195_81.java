public Caption deserialize(JSONObject response) throws JSONException {
        Caption caption = new Caption();
        if (response.has("uri")) {
            caption.setUri(response.getString("uri"));
        }
        if (response.has("src")) {
            caption.setSrc(response.getString("src"));
        }
        if (response.has("srclang")) {
            caption.setSrclang(response.getString("srclang"));
        }
        if (response.has("default")) {
            caption.setDefaut(response.getBoolean("default"));
        }
        return caption;
    }
