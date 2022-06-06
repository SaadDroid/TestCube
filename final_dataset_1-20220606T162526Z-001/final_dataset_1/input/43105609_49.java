@Deprecated
    public Invitation invite(String uid) {
        String url = WxEndpoint.get("url.user.invite");
        String json = "{\"userid\":\"%s\"}";
        logger.debug("invite user: {}", String.format(json, uid));

        try {
            String response = wxClient.post(url, String.format(json, uid));
            Map<String, Object> result = JsonMapper.defaultMapper().json2Map(response);
            if (result.containsKey("type")) {
                return Invitation.format(Integer.valueOf(result.get("type").toString()));
            } else {
                return Invitation.FAILED;
            }
        } catch (Exception e) {
            if (e instanceof WxRuntimeException) {
                WxRuntimeException wxRuntimeException = (WxRuntimeException) e;
                if (60119 == wxRuntimeException.getCode()) {
                    return Invitation.ALREADY_FOLLOWED;
                }
                if (45025 == wxRuntimeException.getCode()) {
                    return Invitation.ALREADY_INVITED;
                }
            }
            return Invitation.FAILED;
        }

    }
