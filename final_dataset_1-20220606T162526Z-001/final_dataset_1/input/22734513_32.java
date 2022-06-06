void writeWebResources( PrintWriter writer, List<String> resources ) {
    resources.stream().forEach( location -> {
      if ( location.startsWith( "/" ) ) {
        location = location.substring( 1 );
      }

      writeDocumentWriteResource( writer, location );
    } );
  }
