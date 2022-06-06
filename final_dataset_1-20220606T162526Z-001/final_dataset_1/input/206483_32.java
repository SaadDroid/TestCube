void interpolateObject( Object obj, Model model, File projectDir, ModelBuildingRequest config,
                            ModelProblemCollector problems )
    {
        List<? extends ValueSource> valueSources = createValueSources( model, projectDir, config, problems );
        List<? extends InterpolationPostProcessor> postProcessors = createPostProcessors( model, projectDir, config );

        InnerInterpolator innerInterpolator = createInterpolator( valueSources, postProcessors, problems );

        PrivilegedAction<Object> action = new InterpolateObjectAction( obj, innerInterpolator, problems );
        AccessController.doPrivileged( action );
    }
