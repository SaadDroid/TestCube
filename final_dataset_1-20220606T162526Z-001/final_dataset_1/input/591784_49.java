public InstallResult install( RepositorySystemSession session, InstallRequest request )
        throws InstallationException
    {
        SyncContext syncContext = syncContextFactory.newInstance( session, false );

        try
        {
            return install( syncContext, session, request );
        }
        finally
        {
            syncContext.release();
        }
    }
