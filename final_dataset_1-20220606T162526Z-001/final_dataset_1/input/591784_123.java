public DependencyNode transformGraph( DependencyNode node, DependencyGraphTransformationContext context )
        throws RepositoryException
    {
        List<?> sortedConflictIds = (List<?>) context.get( TransformationContextKeys.SORTED_CONFLICT_IDS );
        if ( sortedConflictIds == null )
        {
            ConflictIdSorter sorter = new ConflictIdSorter();
            sorter.transformGraph( node, context );

            sortedConflictIds = (List<?>) context.get( TransformationContextKeys.SORTED_CONFLICT_IDS );
        }

        Map<?, ?> conflictIds = (Map<?, ?>) context.get( TransformationContextKeys.CONFLICT_IDS );
        if ( conflictIds == null )
        {
            throw new RepositoryException( "conflict groups have not been identified" );
        }

        Map<DependencyNode, Integer> depths = new IdentityHashMap<DependencyNode, Integer>( conflictIds.size() );
        for ( Object key : sortedConflictIds )
        {
            ConflictGroup group = new ConflictGroup( key );
            depths.clear();
            selectVersion( node, null, 0, depths, group, conflictIds, node );
            pruneNonSelectedVersions( group, conflictIds );
        }

        return node;
    }
