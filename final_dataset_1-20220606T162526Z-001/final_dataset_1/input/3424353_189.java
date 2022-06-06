public CacheableMethodKeyFactory getCacheableMethodKeyFactoryForMethod(
      Method m) {

    /**
     * Try looking for a @Cacheable annotation first and using that first for
     * the CacheableMethodKeyFactory if specified
     */
    Cacheable cacheableAnnotation = m.getAnnotation(Cacheable.class);

    if (cacheableAnnotation != null) {

      Class<? extends CacheableMethodKeyFactory> keyFactoryType = cacheableAnnotation.keyFactory();

      if (!keyFactoryType.equals(CacheableMethodKeyFactory.class))
        try {
          return keyFactoryType.newInstance();
        } catch (Exception ex) {
          throw new IllegalStateException(
              "error instantiating CacheableKeyFactory: "
                  + keyFactoryType.getName(), ex);
        }
    }

    /**
     * Revert to default cacheable method key factory behavior
     */
    Class<?>[] parameters = m.getParameterTypes();
    Annotation[][] annotations = m.getParameterAnnotations();

    int cacheRefreshParameterIndex = -1;
    if (_cacheRefreshIndicatorArgumentIndexByMethod.containsKey(m))
      cacheRefreshParameterIndex = _cacheRefreshIndicatorArgumentIndexByMethod.get(m);

    CacheableObjectKeyFactory[] keyFactories = new CacheableObjectKeyFactory[parameters.length];
    for (int i = 0; i < parameters.length; i++) {

      boolean cacheRefreshIndicator = (i == cacheRefreshParameterIndex);
      CacheableArgument cacheableArgumentAnnotation = getCacheableArgumentAnnotation(annotations[i]);

      if (cacheableArgumentAnnotation != null) {
        keyFactories[i] = getKeyFactoryForCacheableArgumentAnnotation(
            parameters[i], cacheableArgumentAnnotation, cacheRefreshIndicator);
      } else {
        keyFactories[i] = getKeyFactoryForParameterType(parameters[i],
            cacheRefreshIndicator);
      }
    }

    return new DefaultCacheableKeyFactory(keyFactories);
  }
