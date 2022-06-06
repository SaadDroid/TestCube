public List<MetadataResult> resolveMetadata( RepositorySystemSession session,
                                                 Collection<? extends MetadataRequest> requests )
    {
        SyncContext syncContext = syncContextFactory.newInstance( session, false );

        try
        {
            Collection<Metadata> metadata = new ArrayList<Metadata>( requests.size() );
            for ( MetadataRequest request : requests )
            {
                metadata.add( request.getMetadata() );
            }

            syncContext.acquire( null, metadata );

            return resolve( session, requests );
        }
        finally
        {
            syncContext.release();
        }
    }
