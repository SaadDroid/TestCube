public ArtifactResult resolveArtifact( RepositorySystemSession session, ArtifactRequest request )
        throws ArtifactResolutionException
    {
        return resolveArtifacts( session, Collections.singleton( request ) ).get( 0 );
    }
