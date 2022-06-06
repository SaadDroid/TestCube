public DeployResult deploy( RepositorySystemSession session, DeployRequest request )
        throws DeploymentException
    {
        if ( session.isOffline() )
        {
            throw new DeploymentException( "The repository system is in offline mode, deployment impossible" );
        }

        SyncContext syncContext = syncContextFactory.newInstance( session, false );

        try
        {
            return deploy( syncContext, session, request );
        }
        finally
        {
            syncContext.release();
        }
    }
