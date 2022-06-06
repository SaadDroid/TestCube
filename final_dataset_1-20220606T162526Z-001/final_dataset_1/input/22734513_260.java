@Override
  public void processRequireJsPackage() {
    this.dependencyCache = null;
    this.baseModuleIdsMappingsWithDependencies = null;

    this.paths = new HashMap<>();
    this.packages = new ArrayList<>();
    this.baseModuleIdsMappings = new HashMap<>();
    this.shim = new HashMap<>();

    Map<String, String> modules = this.requireJsPackage.getModules();
    if ( modules != null ) {
      modules.forEach( ( moduleId, path ) -> {
        String versionedModuleId = initVersionedModuleId( moduleId );

        if ( path != null ) {
          String versionedPath = getVersionedPath( path );
          this.paths.put( versionedModuleId, versionedPath );
        }

        String moduleMainFile = this.requireJsPackage.getModuleMainFile( moduleId );
        if ( moduleMainFile != null ) {
          if ( !moduleMainFile.equals( "main" ) ) {
            Map<String, String> packageDefinition = new HashMap<>();
            packageDefinition.put( "name", versionedModuleId );
            packageDefinition.put( "main", moduleMainFile );
            this.packages.add( packageDefinition );
          } else {
            this.packages.add( versionedModuleId );
          }
        }
      } );
    }

    // I'm guessing it only makes sense to configure shims for modules included in the package,
    // so the dependencies moduleId mapping isn't needed.
    // Move the moduleId versioning to bellow if that happens to not be the case.
    Map<String, Map<String, ?>> shim = this.requireJsPackage.getShim();
    if ( shim != null ) {
      shim.forEach( ( moduleId, configuration ) -> this.shim.put( getVersionedModuleId( moduleId, this.baseModuleIdsMappings ), merger.clone( configuration ) ) );
    }
  }
