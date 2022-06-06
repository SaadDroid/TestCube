@Override
    public ToolchainsBuildingResult build( ToolchainsBuildingRequest request )
        throws ToolchainsBuildingException
    {
        ProblemCollector problems = ProblemCollectorFactory.newInstance( null );
        
        PersistedToolchains globalToolchains = readToolchains( request.getGlobalToolchainsSource(), request, problems );

        PersistedToolchains userToolchains = readToolchains( request.getUserToolchainsSource(), request, problems );

        toolchainsMerger.merge( userToolchains, globalToolchains, TrackableBase.GLOBAL_LEVEL );
        
        problems.setSource( "" );

        userToolchains = interpolate( userToolchains, problems );

        if ( hasErrors( problems.getProblems() ) )
        {
            throw new ToolchainsBuildingException( problems.getProblems() );
        }


        return new DefaultToolchainsBuildingResult( userToolchains, problems.getProblems() );
    }
