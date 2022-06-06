@Override public boolean canHandle( File artifact ) {
    if ( artifact == null || artifact.getName() == null || !artifact.getName().endsWith( ".zip" ) ) {
      return false;
    }
    ZipFile zipFile = null;
    try {
      zipFile = new ZipFile( artifact );
      Enumeration<? extends ZipEntry> entries = zipFile.entries();
      while ( entries.hasMoreElements() ) {
        String[] splitName = entries.nextElement().getName().split( "/" );
        if ( splitName.length == 2 && PLUGIN_XML_FILENAME.equals( splitName[ 1 ] ) ) {
          return true;
        }
      }
    } catch ( IOException e ) {
      logger.error( e.getMessage(), e );
    } finally {
      if ( zipFile != null ) {
        try {
          zipFile.close();
        } catch ( IOException e ) {
          // Ignore
        }
      }
    }
    return false;
  }
