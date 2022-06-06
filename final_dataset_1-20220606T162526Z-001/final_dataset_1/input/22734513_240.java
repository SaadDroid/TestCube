boolean addBundle( Bundle bundle ) {
    boolean shouldInvalidate;

    try {
      if ( bundle.getState() != Bundle.ACTIVE ) {
        return false;
      }

      // clear any previous configurations (for bundle updates)
      shouldInvalidate = removeBundleInternal( bundle );

      URL packageJsonUrl = bundle.getResource( PACKAGE_JSON_PATH );
      URL configFileUrl = bundle.getResource( REQUIRE_JSON_PATH );

      URL externalResourcesUrl = bundle.getResource( EXTERNAL_RESOURCES_JSON_PATH );
      URL staticResourcesUrl = bundle.getResource( STATIC_RESOURCES_JSON_PATH );

      if ( configFileUrl != null ) {
        // top priority: legacy META-INF/js/require.json
        Map<String, Object> requireJsonObject = this.loadJsonObject( configFileUrl );

        if ( requireJsonObject != null ) {
          IRequireJsPackage packageInfo = new MetaInfRequireJson( requireJsonObject );

          ServiceRegistration<?> serviceRegistration = bundle.getBundleContext().registerService( IRequireJsPackage.class.getName(), packageInfo, null );
          this.serviceRegistrationMap.put( bundle.getBundleId(), serviceRegistration );
        }
      } else if ( packageJsonUrl != null ) {
        // next: fixed META-INF/js/package.json
        Map<String, Object> packageJsonObject = this.loadJsonObject( packageJsonUrl );

        if ( packageJsonObject != null ) {
          IRequireJsPackage packageInfo = new MetaInfPackageJson( packageJsonObject );

          ServiceRegistration<?> serviceRegistration = bundle.getBundleContext().registerService( IRequireJsPackage.class.getName(), packageInfo, null );
          this.serviceRegistrationMap.put( bundle.getBundleId(), serviceRegistration );
        }
      }

      // always process legacy META-INF/js/externalResources.json and META-INF/js/staticResources.json
      if ( externalResourcesUrl != null ) {
        Map<String, Object> externalResourceJsonObject = this.loadJsonObject( externalResourcesUrl );
        Map<String, Object> staticResourceJsonObject = this.loadJsonObject( staticResourcesUrl );

        if ( externalResourceJsonObject != null ) {
          List<String> requireJsList = getRequireJsList( externalResourceJsonObject, staticResourceJsonObject );

          if ( requireJsList != null ) {
            this.requireConfigMap.put( bundle.getBundleId(), new BundledPlatformPluginRequireJsConfigurations( bundle, requireJsList ) );
            shouldInvalidate = true;
          }
        }
      }
    } catch ( Exception e ) {
      shouldInvalidate = true;
    }

    return shouldInvalidate;
  }
