@Override public Observable<User> user(String userId, boolean forceUpdate) {
    Observable<UserEntity> cloudDataObs = cloudDataStore.userEntity(userId)
        .doOnNext(userEntity -> realmDataStore.save(userEntity));
    Observable<UserEntity> localDataObs = realmDataStore.userEntity(userId);

    return localDataObs.exists(userEntity -> userEntity != null)
        .flatMap(isInDb -> (isInDb && !forceUpdate) ? localDataObs : cloudDataObs)
        .map(userEntityDataMapper::transform);
  }
