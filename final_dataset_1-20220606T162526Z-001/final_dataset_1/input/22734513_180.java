public void process( Supplier<ZipInputStream> zipInputStreamProvider, ZipOutputStream zipOutputStream )
          throws IOException {
    File dir = Files.createTempDir();
    PluginMetadata pluginMetadata = null;
    try {
      pluginMetadata = new PluginMetadataImpl( dir );
    } catch ( ParserConfigurationException e ) {
      throw new IOException( e );
    }
    Manifest manifest = null;
    ZipInputStream zipInputStream = zipInputStreamProvider.get();
    try {
      logger.debug( "Processing plugin - Name: {} SymbolicName: {} Version: {}",
              this.name, this.symbolicName, this.version );
      ZipEntry zipEntry;

      byte[]  pluginSpringXmlBytes = null;
      String pluginSpringXmlName = null;
      while ( ( zipEntry = zipInputStream.getNextEntry() ) != null ) {
        String name = zipEntry.getName();

        byte[] bytes = getEntryBytes( zipInputStream );
        // [BACKLOG-14815]
        // Ensures the plugin.xml file is read before plugin.spring.xml. This is needed so
        // {@link org.pentaho.osgi.platform.plugin.deployer.impl.handlers.SpringFileHandler#handle()}
        // can get the proper bundleName and set the service entry point.
        if ( pluginSpringXmlBytes == null && name != null && name.endsWith( PLUGIN_SPRING_XML_FILENAME ) ) {
          pluginSpringXmlBytes = bytes; // Store plugin.spring.xml for processing after plugin.xml
          pluginSpringXmlName = name;
        } else {
          processEntry( zipOutputStream, pluginMetadata, zipEntry.isDirectory(), name, bytes );
        }
      }

      if ( pluginSpringXmlBytes != null ) {
        processEntry( zipOutputStream, pluginMetadata, false, pluginSpringXmlName, pluginSpringXmlBytes );
      }

    } finally {
      IOUtils.closeQuietly( zipInputStream );
    }



    // Write blueprint to disk, picked up with others later
    int tries = 100;
    File blueprintDir =
            new File( dir.getAbsolutePath() + "/" + BLUEPRINT.substring( 0, BLUEPRINT.lastIndexOf( '/' ) ) );
    while ( !blueprintDir.exists() && tries-- > 0 ) {
      blueprintDir.mkdirs();
    }
    FileOutputStream blueprintOutputStream = null;
    try {
      blueprintOutputStream = new FileOutputStream( dir.getAbsolutePath() + "/" + BLUEPRINT );
      pluginMetadata.writeBlueprint( name, blueprintOutputStream );
    } finally {
      if ( blueprintOutputStream != null ) {
        blueprintOutputStream.close();
      }
    }


    Set<String> createdEntries = new HashSet<String>();

    // 1. Write Manifest Directory
    String manifestFolder = JarFile.MANIFEST_NAME.split( "/" )[ 0 ] + "/";
    ZipEntry manifestFolderEntry = new ZipEntry( manifestFolder );
    zipOutputStream.putNextEntry( manifestFolderEntry );
    zipOutputStream.closeEntry();
    createdEntries.add( manifestFolder );

    // 2. Write Manifest
    ZipEntry manifestEntry = new ZipEntry( JarFile.MANIFEST_NAME );
    zipOutputStream.putNextEntry( manifestEntry );
    pluginMetadata.getManifestUpdater()
            .write( manifest, zipOutputStream, name, symbolicName, version );
    zipOutputStream.closeEntry();
    createdEntries.add( JarFile.MANIFEST_NAME );

    // Handlers may have written files to disk which need to be added.
    Stack<File> dirStack = new Stack<File>();
    dirStack.push( dir );
    int len = 0;
    byte[] buffer = new byte[ 1024 ];
    try {
      while ( dirStack.size() > 0 ) {
        File currentDir = dirStack.pop();
        String dirName = currentDir.getAbsolutePath().substring( dir.getAbsolutePath().length() ) + "/";
        if ( dirName.startsWith( "/" ) || dirName.startsWith( "\\" ) ) {
          dirName = dirName.substring( 1 );
        }
        if ( dirName.length() > 0 && !createdEntries.contains( dirName ) ) {
          ZipEntry zipEntry = new ZipEntry( dirName.replaceAll( Pattern.quote( "\\" ), "/" ) );
          zipOutputStream.putNextEntry( zipEntry );
          zipOutputStream.closeEntry();
        }
        File[] dirFiles = currentDir.listFiles();
        if ( dirFiles != null ) {
          for ( File childFile : dirFiles ) {
            if ( childFile.isDirectory() ) {
              dirStack.push( childFile );
            } else {
              String fileName = childFile.getAbsolutePath().substring( dir.getAbsolutePath().length() + 1 );
              FileInputStream fileInputStream = null;
              try {
                fileInputStream = new FileInputStream( childFile );
                ZipEntry childZipEntry = new ZipEntry( fileName.replaceAll( Pattern.quote( "\\" ), "/" ) );
                zipOutputStream.putNextEntry( childZipEntry );
                while ( ( len = fileInputStream.read( buffer ) ) != -1 ) {
                  zipOutputStream.write( buffer, 0, len );
                }
                zipOutputStream.closeEntry();
              } finally {
                if ( fileInputStream != null ) {
                  fileInputStream.close();
                }
              }
            }
          }
        }
      }
    } finally {
      IOUtils.closeQuietly( zipOutputStream );
      recursiveDelete( dir );
    }
  }
