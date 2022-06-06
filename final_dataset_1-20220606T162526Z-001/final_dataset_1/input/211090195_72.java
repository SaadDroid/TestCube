public Player deserialize(JSONObject response) throws JSONException {
        Player player = new Player();
        AssetsPlayer assets = new AssetsPlayer();

        if (response.has("playerId")) {
            player.setPlayerId(response.getString("playerId"));
        }
        if (response.has("assets")) {
            JSONObject asset = response.getJSONObject("assets");
            assets.setLogo(asset.getString("logo"));
            assets.setLink(asset.getString("link"));
            player.setAssets(assets);
        }
        if (response.has("shapeMargin")) {
            player.setShapeMargin(response.getInt("shapeMargin"));
        }
        if (response.has("shapeRadius")) {
            player.setShapeRadius(response.getInt("shapeRadius"));
        }
        if (response.has("shapeAspect")) {
            player.setShapeAspect(response.getString("shapeAspect"));
        }
        if (response.has("shapeBackgroundTop")) {
            player.setShapeBackgroundTop(response.getString("shapeBackgroundTop"));
        }
        if (response.has("shapeBackgroundBottom")) {
            player.setShapeBackgroundBottom(response.getString("shapeBackgroundBottom"));
        }
        if (response.has("text")) {
            player.setText(response.getString("text"));
        }
        if (response.has("link")) {
            player.setLink(response.getString("link"));
        }
        if (response.has("linkHover")) {
            player.setLinkHover(response.getString("linkHover"));
        }
        if (response.has("linkActive")) {
            player.setLinkActive(response.getString("linkActive"));
        }
        if (response.has("trackPlayed")) {
            player.setTrackPlayed(response.getString("trackPlayed"));
        }
        if (response.has("trackUnplayed")) {
            player.setTrackUnplayed(response.getString("trackUnplayed"));
        }
        if (response.has("trackBackground")) {
            player.setTrackBackground(response.getString("trackBackground"));
        }
        if (response.has("backgroundTop")) {
            player.setBackgroundTop(response.getString("backgroundTop"));
        }
        if (response.has("backgroundBottom")) {
            player.setBackgroundBottom(response.getString("backgroundBottom"));
        }
        if (response.has("backgroundText")) {
            player.setBackgroundText(response.getString("backgroundText"));
        }
        if (response.has("language")) {
            player.setLanguage(response.getString("language"));
        }
        if (response.has("enableApi")) {
            player.setEnableApi(response.getBoolean("enableApi"));
        }
        if (response.has("enableControls")) {
            player.setEnableControls(response.getBoolean("enableControls"));
        }
        if (response.has("forceAutoplay")) {
            player.setForceAutoplay(response.getBoolean("forceAutoplay"));
        }
        if (response.has("hideTitle")) {
            player.setHideTitle(response.getBoolean("hideTitle"));
        }
        if (response.has("forceLoop")) {
            player.setForceLoop(response.getBoolean("forceLoop"));
        }
        return player;
    }
