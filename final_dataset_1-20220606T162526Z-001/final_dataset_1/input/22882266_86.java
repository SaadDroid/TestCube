public static OSGIPluginRegistryExtension getInstance() {
    if ( INSTANCE == null ) {
      throw new IllegalStateException( "Kettle is supposed to construct this first" );
    }
    return INSTANCE;
  }
