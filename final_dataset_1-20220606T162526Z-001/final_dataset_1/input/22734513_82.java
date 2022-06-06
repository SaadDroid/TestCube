@Override
  public <K, V, C extends Configuration<K, V>> Cache<K, V> newCache( final String cacheName, final C configuration ) {
    CacheBuilder<Object, Object> cacheBuilder = CacheBuilder.newBuilder();

    if ( configuration instanceof CompleteConfiguration ) {
      configureCacheBuilder( (CompleteConfiguration) configuration, cacheBuilder );
    }

    return new WrappedCache<K, V>( cacheBuilder.<K, V>build() ) {
      @Override public String getName() {
        return cacheName;
      }

      @Override public CacheManager getCacheManager() {
        return GuavaCacheManager.this;
      }

      @Override public void close() {
        if ( !isClosed() ) {
          super.close();
          destroyCache( cacheName );
        }
      }

      @Override public <T extends Configuration<K, V>> T getConfiguration( Class<T> clazz ) {
        return Constants.unwrap( configuration, clazz );
      }
    };
  }
