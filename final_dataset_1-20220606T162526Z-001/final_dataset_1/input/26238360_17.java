public Map<String,String> normalize( Collection<String> aFieldnames ) throws SdiException
    {
        Map<String,String> configuredReplaceMap = new HashMap<String,String>();

        for ( String key : PersonKey.getKeyNames() )
        {
            String keyName = InputCollectorMappingProperties.KEY_PREFIX + key;

            String configuredMapping = myEnv.getProperty( keyName );

            if ( !StringUtils.hasText( configuredMapping ) )
            {
                continue;
            } // if StringUtils.hasText( configuredMapping )

            configuredMapping = configuredMapping.trim();

            myLog.debug( "Found input collector mapping: " + keyName + " -> " + configuredMapping );

            configuredReplaceMap.put( configuredMapping, key );

        }

        Map<String,String> result = new HashMap<>();

        for ( String collectedFieldName : aFieldnames )
        {
            String normalized = null;

            if ( configuredReplaceMap.containsKey( collectedFieldName ) )
            {
                normalized = configuredReplaceMap.remove( collectedFieldName );
                myLog.debug( "Normalizing collected fieldname " + collectedFieldName
                             + " by " + normalized );
            }
            else
            {
                if ( !PersonKey.getKeyNames().contains( collectedFieldName ) )
                {
                    throw new SdiException( "Given fieldname \"" + collectedFieldName + "\" not configured for "
                            + "normalizing",
                            SdiException.EXIT_CODE_CONFIG_ERROR );
                } // if condition

                myLog.debug( "Given fieldname " + collectedFieldName + " already normalized" );
                normalized = collectedFieldName;
            }

            result.put( collectedFieldName, normalized );
        }

        if ( !configuredReplaceMap.isEmpty() )
        {
            myLog.warn( "At least one configured input collector mapping not contained in"
                                    + " given input list: "
                                    + configuredReplaceMap.values() );

        } // if !replaceMap.isEmpty()

        myLog.debug( "Normalized field names: " + result );

        return result;
    }
