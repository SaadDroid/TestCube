@Override public void bundleChanged( BundleEvent event ) {
    switch ( event.getType() ) {
      case BundleEvent.STARTED:
      case BundleEvent.STOPPED:
        try {
          localizationManager.bundleChanged( event.getBundle() );
        } catch ( Exception e ) {
          log.error( e.getMessage(), e );
        }
        break;
    }
  }
