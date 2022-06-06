@SuppressWarnings( "unchecked" )
    public static <T> Collection<Class<T>> findCandidatesByAnnotation( Class<T> aClass,
                                                             Class<? extends Annotation> aAnnotation,
                                                             String aRoot )
    {
        Collection<Class<T>> result = new ArrayList<Class<T>>();

        Collection<? extends Class<?>> candidates = findCandidatesByAnnotation( aAnnotation,
                                                                                aRoot );

        candidates.stream()
            .peek( c -> myLog.trace( "inspecting candidate " + c.getName() ) )
            .filter( c -> aClass.isAssignableFrom( c ) )
            .peek( c -> myLog.debug( "candidate " + c.getName() + " is of desired type" ) )
            .forEach( c -> result.add( (Class<T>) c ) );

        return result;

    }
