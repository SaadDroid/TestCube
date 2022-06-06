public void checkArtifact( RepositorySystemSession session, UpdateCheck<Artifact, ArtifactTransferException> check )
    {
        if ( check.getLocalLastUpdated() != 0
            && !isUpdatedRequired( session, check.getLocalLastUpdated(), check.getPolicy() ) )
        {
            if ( logger.isDebugEnabled() )
            {
                logger.debug( "Skipped remote update check for " + check.getItem()
                    + ", locally installed artifact up-to-date." );
            }

            check.setRequired( false );
            return;
        }

        Artifact artifact = check.getItem();
        RemoteRepository repository = check.getRepository();

        File artifactFile = check.getFile();
        if ( artifactFile == null )
        {
            throw new IllegalArgumentException( String.format( "The artifact '%s' has no file attached", artifact ) );
        }

        boolean fileExists = check.isFileValid() && artifactFile.exists();

        File touchFile = getTouchFile( artifact, artifactFile );
        Properties props = read( touchFile );

        String updateKey = getUpdateKey( artifactFile, repository );
        String dataKey = getDataKey( artifact, artifactFile, repository );

        String error = getError( props, dataKey );

        long lastUpdated;
        if ( fileExists )
        {
            lastUpdated = artifactFile.lastModified();
        }
        else if ( error == null )
        {
            // this is the first attempt ever
            lastUpdated = 0;
        }
        else if ( error.length() <= 0 )
        {
            // artifact did not exist
            lastUpdated = getLastUpdated( props, dataKey );
        }
        else
        {
            // artifact could not be transferred
            String transferKey = getTransferKey( artifact, artifactFile, repository );
            lastUpdated = getLastUpdated( props, transferKey );
        }

        if ( isAlreadyUpdated( session.getData(), updateKey ) )
        {
            if ( logger.isDebugEnabled() )
            {
                logger.debug( "Skipped remote update check for " + check.getItem()
                    + ", already updated during this session." );
            }

            check.setRequired( false );
            if ( error != null )
            {
                check.setException( newException( error, artifact, repository ) );
            }
        }
        else if ( lastUpdated == 0 )
        {
            check.setRequired( true );
        }
        else if ( isUpdatedRequired( session, lastUpdated, check.getPolicy() ) )
        {
            check.setRequired( true );
        }
        else if ( fileExists )
        {
            if ( logger.isDebugEnabled() )
            {
                logger.debug( "Skipped remote update check for " + check.getItem()
                    + ", locally cached artifact up-to-date." );
            }

            check.setRequired( false );
        }
        else
        {
            if ( error == null || error.length() <= 0 )
            {
                if ( session.isNotFoundCachingEnabled() )
                {
                    check.setRequired( false );
                    check.setException( newException( error, artifact, repository ) );
                }
                else
                {
                    check.setRequired( true );
                }
            }
            else
            {
                if ( session.isTransferErrorCachingEnabled() )
                {
                    check.setRequired( false );
                    check.setException( newException( error, artifact, repository ) );
                }
                else
                {
                    check.setRequired( true );
                }
            }
        }
    }
