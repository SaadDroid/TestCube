public CollectResult collectDependencies( RepositorySystemSession session, CollectRequest request )
        throws DependencyCollectionException
    {
        session = optimizeSession( session );

        RequestTrace trace = DefaultRequestTrace.newChild( request.getTrace(), request );

        CollectResult result = new CollectResult( request );

        DependencySelector depSelector = session.getDependencySelector();
        DependencyManager depManager = session.getDependencyManager();
        DependencyTraverser depTraverser = session.getDependencyTraverser();

        Dependency root = request.getRoot();
        List<RemoteRepository> repositories = request.getRepositories();
        List<Dependency> dependencies = request.getDependencies();
        List<Dependency> managedDependencies = request.getManagedDependencies();

        GraphEdge edge = null;
        if ( root != null )
        {
            VersionRangeResult rangeResult;
            try
            {
                VersionRangeRequest rangeRequest =
                    new VersionRangeRequest( root.getArtifact(), request.getRepositories(), request.getRequestContext() );
                rangeRequest.setTrace( trace );
                rangeResult = versionRangeResolver.resolveVersionRange( session, rangeRequest );

                if ( rangeResult.getVersions().isEmpty() )
                {
                    throw new VersionRangeResolutionException( rangeResult, "No versions available for "
                        + root.getArtifact() + " within specified range" );
                }
            }
            catch ( VersionRangeResolutionException e )
            {
                result.addException( e );
                throw new DependencyCollectionException( result );
            }

            Version version = rangeResult.getVersions().get( rangeResult.getVersions().size() - 1 );
            root = root.setArtifact( root.getArtifact().setVersion( version.toString() ) );

            ArtifactDescriptorResult descriptorResult;
            try
            {
                ArtifactDescriptorRequest descriptorRequest = new ArtifactDescriptorRequest();
                descriptorRequest.setArtifact( root.getArtifact() );
                descriptorRequest.setRepositories( request.getRepositories() );
                descriptorRequest.setRequestContext( request.getRequestContext() );
                descriptorRequest.setTrace( trace );
                if ( isLackingDescriptor( root.getArtifact() ) )
                {
                    descriptorResult = new ArtifactDescriptorResult( descriptorRequest );
                }
                else
                {
                    descriptorResult = descriptorReader.readArtifactDescriptor( session, descriptorRequest );
                }
            }
            catch ( ArtifactDescriptorException e )
            {
                result.addException( e );
                throw new DependencyCollectionException( result );
            }

            root = root.setArtifact( descriptorResult.getArtifact() );

            repositories =
                remoteRepositoryManager.aggregateRepositories( session, repositories,
                                                               descriptorResult.getRepositories(), true );
            dependencies = mergeDeps( dependencies, descriptorResult.getDependencies() );
            managedDependencies = mergeDeps( managedDependencies, descriptorResult.getManagedDependencies() );

            GraphNode node = new GraphNode();
            node.setAliases( descriptorResult.getAliases() );
            node.setRepositories( request.getRepositories() );

            edge = new GraphEdge( node );
            edge.setDependency( root );
            edge.setRequestContext( request.getRequestContext() );
            edge.setRelocations( descriptorResult.getRelocations() );
            edge.setVersionConstraint( rangeResult.getVersionConstraint() );
            edge.setVersion( version );
        }
        else
        {
            edge = new GraphEdge( new GraphNode() );
        }

        result.setRoot( edge );

        boolean traverse = ( root == null ) || depTraverser.traverseDependency( root );

        if ( traverse && !dependencies.isEmpty() )
        {
            DataPool pool = new DataPool( session );

            EdgeStack edges = new EdgeStack();
            edges.push( edge );

            DefaultDependencyCollectionContext context =
                new DefaultDependencyCollectionContext( session, root, managedDependencies );

            Args args = new Args( result, session, trace, pool, edges, context );

            process( args, dependencies, repositories, depSelector.deriveChildSelector( context ),
                     depManager.deriveChildManager( context ), depTraverser.deriveChildTraverser( context ) );
        }

        DependencyGraphTransformer transformer = session.getDependencyGraphTransformer();
        try
        {
            DefaultDependencyGraphTransformationContext context =
                new DefaultDependencyGraphTransformationContext( session );
            result.setRoot( transformer.transformGraph( edge, context ) );
        }
        catch ( RepositoryException e )
        {
            result.addException( e );
        }

        if ( !result.getExceptions().isEmpty() )
        {
            throw new DependencyCollectionException( result );
        }

        return result;
    }
