public TagUsers getUsers(int id) {
        String url = WxEndpoint.get("url.tag.user.get");
        logger.debug("get tag user: {}", id);
        String response = wxClient.get(String.format(url, id));
        TagUsers tagUsers = JsonMapper.defaultMapper().fromJson(response, TagUsers.class);
        tagUsers.setTagId(id);
        return tagUsers;
    }
