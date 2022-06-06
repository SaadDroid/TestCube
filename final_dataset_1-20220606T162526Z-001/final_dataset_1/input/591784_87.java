public static DependencyFilter classpathFilter( String... classpathTypes )
    {
        return classpathFilter( ( classpathTypes != null ) ? Arrays.asList( classpathTypes ) : null );
    }
