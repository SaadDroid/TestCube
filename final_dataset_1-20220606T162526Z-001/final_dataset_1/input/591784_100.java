public boolean accept( DependencyNode node, List<DependencyNode> parents )
    {
        for ( DependencyFilter filter : filters )
        {
            if ( filter.accept( node, parents ) )
            {
                return true;
            }
        }
        return false;
    }
