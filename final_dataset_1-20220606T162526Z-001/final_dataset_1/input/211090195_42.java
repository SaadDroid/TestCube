public LiveStream deserialize(JSONObject response) throws JSONException {
        LiveStream liveStream = new LiveStream();
        Assets assets = new Assets();

        if (response.has("liveStreamId")) {
            liveStream.setLiveStreamId(response.getString("liveStreamId"));
        }
        if (response.has("streamKey")) {
            liveStream.setStreamKey(response.getString("streamKey"));
        }
        if (response.has("name")) {
            liveStream.setName(response.getString("name"));
        }
        if (response.has("record")) {
            liveStream.setRecord(response.getBoolean("record"));
        }
        if (response.has("broadcasting")) {
            liveStream.setBroadcasting(response.getBoolean("broadcasting"));
        }
        if (response.has("assets")) {
            JSONObject asset = response.getJSONObject("assets");
            assets.setIframe(asset.getString("iframe"));
            assets.setPlayer(asset.getString("player"));
            assets.setHls(asset.getString("hls"));
            assets.setThumbnail(asset.getString("thumbnail"));
            liveStream.setAssets(assets);
        }
        if (response.has("playerId")) {
            liveStream.setPlayerId(response.getString("playerId"));
        }
        return liveStream;
    }
