public void stop( BundleContext bundleContext ) {
    if ( this.pentahoWebPackageServiceTracker != null ) {
      this.pentahoWebPackageServiceTracker.close();

      this.pentahoWebPackageServiceTracker = null;
    }
  }
