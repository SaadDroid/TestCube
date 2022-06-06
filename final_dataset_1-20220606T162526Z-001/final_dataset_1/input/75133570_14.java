public void insertBookmark(String postId, User user) {
    // Create user key from user id.
    final Key<Account> authKey = Key.create(user.getUserId());

    final Key<PostEntity> postKey = Key.create(postId);

    Bookmark saved = createBookmark(postKey, authKey);

    final Key<PostShard> postShardKey = postShardService.getRandomShardKey(postKey);

    PostShard shard = ofy().load().key(postShardKey).now();
    shard.getBookmarkKeys().add(saved.getKey());

    ofy().save().entities(saved, shard);
  }
