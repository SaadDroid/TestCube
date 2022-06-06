@Override public ICapability getCapabilityById( String id ) {
    try {
      Feature feature = featuresService.getFeature( id );
      if ( feature == null ) {
        logger.error( "No feature found matching id: " + id );
        return null;
      }
      return new KarafCapability( featuresService, feature, this );
    } catch ( Exception e ) {
      logger.error( "Unknown error retrieving feature: " + id, e );
    }
    return null;
  }
