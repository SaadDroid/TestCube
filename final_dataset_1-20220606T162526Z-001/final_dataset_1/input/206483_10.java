public Path createDist( WrapperConfiguration configuration )
        throws IOException, URISyntaxException
    {
        URI distributionUrl;
        String mvnwRepoUrl = System.getenv( MavenWrapperMain.MVNW_REPOURL );
        if ( mvnwRepoUrl != null && !mvnwRepoUrl.isEmpty() )
        {
            distributionUrl = new URI( mvnwRepoUrl + "/" + MavenWrapperMain.MVN_PATH );
            Logger.info( "Detected MVNW_REPOURL environment variable " + mvnwRepoUrl );
        }
        else
        {
            distributionUrl = configuration.getDistribution();
        }
        Logger.info( "Downloading Maven binary from " + distributionUrl );
        boolean alwaysDownload = configuration.isAlwaysDownload();
        boolean alwaysUnpack = configuration.isAlwaysUnpack();

        PathAssembler.LocalDistribution localDistribution = pathAssembler.getDistribution( configuration );

        Path localZipFile = localDistribution.getZipFile();
        boolean downloaded = false;
        if ( alwaysDownload || !Files.exists( localZipFile ) )
        {
            Path tmpZipFile = localZipFile.resolveSibling( localZipFile.getFileName() + ".part" );
            Files.deleteIfExists( tmpZipFile );
            Logger.info( "Downloading " + distributionUrl );
            download.download( distributionUrl, tmpZipFile );
            Files.move( tmpZipFile, localZipFile );
            downloaded = true;
        }

        Path distDir = localDistribution.getDistributionDir();
        List<Path> dirs = listDirs( distDir );

        if ( downloaded || alwaysUnpack || dirs.isEmpty() )
        {
            Files.walkFileTree( distDir.toAbsolutePath(), new SimpleFileVisitor<Path>()
            {
                @Override
                public FileVisitResult postVisitDirectory( Path dir, IOException exc )
                    throws IOException
                {
                    if ( dir.getParent().equals( distDir ) )
                    {
                        Logger.info( "Deleting directory " + distDir.toAbsolutePath() );
                        Files.delete( dir );
                    }
                    return FileVisitResult.CONTINUE;
                }

                public FileVisitResult visitFile( Path file, BasicFileAttributes attrs )
                    throws IOException
                {
                    if ( !file.getParent().equals( distDir ) )
                    {
                        Files.delete( file );
                    }
                    return FileVisitResult.CONTINUE;
                };
            } );

            Logger.info( "Unzipping " + localZipFile.toAbsolutePath() + " to " + distDir.toAbsolutePath() );
            unzip( localZipFile, distDir );

            dirs = listDirs( distDir );
            if ( dirs.isEmpty() )
            {
                throw new RuntimeException( String.format( 
                   "Maven distribution '%s' does not contain any directories. Expected to find exactly 1 directory.",
                   distributionUrl ) );
            }
            setExecutablePermissions( dirs.get( 0 ) );
        }
        if ( dirs.size() != 1 )
        {
            throw new IllegalStateException( String.format( 
                   "Maven distribution '%s' contains too many directories. Expected to find exactly 1 directory.",
                   distributionUrl ) );
        }
        return dirs.get( 0 );
    }
