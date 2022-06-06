@Override
  public void apply( IRequireJsPackageConfiguration requireJsPackageConfig,
                     Function<String, IRequireJsPackageConfiguration> dependencyResolver,
                     Function<String, String> resolveModuleId,
                     Map<String, ?> requireConfig ) {
    if ( requireJsPackageConfig.getRequireJsPackage() instanceof MetaInfRequireJson ) {
      MetaInfRequireJson metaInfRequireJson = (MetaInfRequireJson) requireJsPackageConfig.getRequireJsPackage();

      if ( !metaInfRequireJson.isAmdPackage() ) {
        Set<String> packageShimDependencies = new LinkedHashSet<>();

        Map<String, String> dependencies = requireJsPackageConfig.getDependencies();
        for ( String dependencyPackageName : dependencies.keySet() ) {
          final IRequireJsPackageConfiguration dependencyResolvedVersion = dependencyResolver.apply( dependencyPackageName );

          if ( dependencyResolvedVersion != null && dependencyResolvedVersion.getRequireJsPackage() instanceof MetaInfRequireJson ) {
            MetaInfRequireJson depMetaInfRequireJson = (MetaInfRequireJson) dependencyResolvedVersion.getRequireJsPackage();

            if ( !depMetaInfRequireJson.isAmdPackage() ) {
              packageShimDependencies.addAll( dependencyResolvedVersion.getBaseModuleIdsMapping().values() );
            }
          }
        }

        Map<String, Map<String, ?>> shim = (Map<String, Map<String, ?>>) requireConfig.get( "shim" );

        Map<String, Object> packageShim = new HashMap<>();

        if ( !packageShimDependencies.isEmpty() ) {
          packageShim.put( "deps", Collections.unmodifiableList( new ArrayList<>( packageShimDependencies ) ) );
        }

        if ( metaInfRequireJson.getExports() != null && !metaInfRequireJson.getExports().isEmpty() ) {
          packageShim.put( "exports", metaInfRequireJson.getExports() );
        }

        if ( !packageShim.isEmpty() ) {
          Map<String, String> modules = metaInfRequireJson.getModules();
          if ( modules != null ) {
            modules.forEach( ( moduleId, path ) -> {
              String versionedModuleId = resolveModuleId.apply( moduleId );

              shim.put( versionedModuleId, packageShim );

              String moduleMainFile = metaInfRequireJson.getModuleMainFile( moduleId );
              if ( moduleMainFile != null ) {
                shim.put( versionedModuleId + "/" + moduleMainFile, packageShim );
              }
            } );
          }
        }
      }
    }
  }
