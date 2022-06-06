public static void execute( final File folder ) {
        logger.trace( folder );
        ViewPage viewPage = new ViewPage( folder );
        Path indexhtml = folder.toPath().resolve( "index.html" );
        try {
            viewPage.saveAt( indexhtml );
            viewPage.copyFiles();
        } catch ( IOException ex ) {
            throw new MDRuntimeException( ex );
        }
    }
