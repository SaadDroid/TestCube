@Override public Future<Boolean> install() {
    SettableFuture<Boolean> installFuture = SettableFuture.<Boolean>create();
    try {
      manager.watchForInstall( feature, installFuture );
      featuresService.installFeature( feature, EnumSet.noneOf( FeaturesService.Option.class ) );
    } catch ( Exception e ) {
      logger.error( "Unknown error installing feature", e );
      installFuture.set( false );
      installFuture.setException( e );
    }
    return installFuture;
  }
