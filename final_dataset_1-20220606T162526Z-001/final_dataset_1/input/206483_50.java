protected void mergePatternSet_Excludes( PatternSet target, PatternSet source, boolean sourceDominant,
                                             Map<Object, Object> context )
    {
        target.setExcludes( merge( target.getExcludes(), source.getExcludes(), sourceDominant, e -> e ) );
    }
