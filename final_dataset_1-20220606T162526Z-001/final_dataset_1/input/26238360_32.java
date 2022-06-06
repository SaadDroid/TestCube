public static Collection<String> getPropertyNamesStartingWith( ConfigurableEnvironment aEnv,
                                                                   String aKeyPrefix )
    {
        return getAllPropertyNames( aEnv ).stream()
            .filter( key -> key.startsWith( aKeyPrefix ) )
            .collect( Collectors.toCollection( (Supplier<Set<String>>) TreeSet::new ) );
    }
