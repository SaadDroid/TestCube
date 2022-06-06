<K, V> void configureCacheBuilder( CompleteConfiguration<K, V> completeConfiguration,
                                     CacheBuilder<Object, Object> cacheBuilder ) {
    ExpiryPolicy expiryPolicy = completeConfiguration.getExpiryPolicyFactory().create();

    Duration expiryForAccess = expiryPolicy.getExpiryForAccess();
    if ( expiryForAccess != null && !expiryForAccess.isEternal() ) {
      cacheBuilder.expireAfterAccess( expiryForAccess.getDurationAmount(), expiryForAccess.getTimeUnit() );
    }
    Duration expiryForUpdate = expiryPolicy.getExpiryForUpdate();
    if ( expiryForUpdate != null && !expiryForUpdate.isEternal() ) {
      cacheBuilder.expireAfterWrite( expiryForUpdate.getDurationAmount(), expiryForUpdate.getTimeUnit() );
    }
  }
