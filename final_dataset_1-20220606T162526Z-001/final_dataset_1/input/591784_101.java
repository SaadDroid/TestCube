public boolean accept( DependencyNode node, List<DependencyNode> parents )
    {
        Dependency dependency = node.getDependency();

        if ( dependency == null )
        {
            return true;
        }

        String scope = node.getDependency().getScope();
        return ( included.isEmpty() || included.contains( scope ) )
            && ( excluded.isEmpty() || !excluded.contains( scope ) );
    }
