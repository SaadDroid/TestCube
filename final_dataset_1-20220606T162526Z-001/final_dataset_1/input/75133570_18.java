@Override
  public Map<Ref<PostShard>, PostShard> createShardMapWithRef(Iterable<Key<PostEntity>> keys) {
    return Observable
        .fromIterable(keys)
        .flatMap(this::createShardsFromPostKey)
        .toMap(Ref::create)
        .blockingGet();
  }
