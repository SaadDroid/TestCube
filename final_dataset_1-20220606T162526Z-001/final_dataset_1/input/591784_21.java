public void checkMetadata( RepositorySystemSession session, UpdateCheck<Metadata, MetadataTransferException> check )
    {
        if ( check.getLocalLastUpdated() != 0
            && !isUpdatedRequired( session, check.getLocalLastUpdated(), check.getPolicy() ) )
        {
            if ( logger.isDebugEnabled() )
            {
                logger.debug( "Skipped remote update check for " + check.getItem()
                    + ", locally installed metadata up-to-date." );
            }

            check.setRequired( false );
            return;
        }

        Metadata metadata = check.getItem();
        RemoteRepository repository = check.getRepository();

        File metadataFile = check.getFile();
        if ( metadataFile == null )
        {
            throw new IllegalArgumentException( String.format( "The metadata '%s' has no file attached", metadata ) );
        }

        boolean fileExists = check.isFileValid() && metadataFile.exists();

        File touchFile = getTouchFile( metadata, metadataFile );
        Properties props = read( touchFile );

        String updateKey = getUpdateKey( metadataFile, repository );
        String dataKey = getDataKey( metadata, metadataFile, check.getAuthoritativeRepository() );

        String error = getError( props, dataKey );

        long lastUpdated;
        if ( error == null )
        {
            if ( fileExists )
            {
                // last update was successful
                lastUpdated = getLastUpdated( props, dataKey );
            }
            else
            {
                // this is the first attempt ever
                lastUpdated = 0;
            }
        }
        else if ( error.length() <= 0 )
        {
            // metadata did not exist
            lastUpdated = getLastUpdated( props, dataKey );
        }
        else
        {
            // metadata could not be transferred
            String transferKey = getTransferKey( metadata, metadataFile, repository );
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
                check.setException( newException( error, metadata, repository ) );
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
                    + ", locally cached metadata up-to-date." );
            }

            check.setRequired( false );
        }
        else
        {
            if ( error == null || error.length() <= 0 )
            {
                check.setRequired( false );
                check.setException( newException( error, metadata, repository ) );
            }
            else
            {
                if ( session.isTransferErrorCachingEnabled() )
                {
                    check.setRequired( false );
                    check.setException( newException( error, metadata, repository ) );
                }
                else
                {
                    check.setRequired( true );
                }
            }
        }
    }
