public static Dataset create( Collection<String> aKeys, Collection<Object> aValues )
        throws SdiException
    {
        if ( aKeys == null )
        {
            throw new SdiException( "Given keys is null!",
                                    SdiException.EXIT_CODE_PARSE_ERROR );
        }

        if ( aValues == null )
        {
            throw new SdiException( "Given values is null!",
                                    SdiException.EXIT_CODE_PARSE_ERROR );
        }

        if ( aKeys.size() != aValues.size() )
        {
            throw new SdiException( "Given collections are not the same in size. Keys: " + aKeys.size()
                                    + "; Values: " + aValues.size(),
                                    SdiException.EXIT_CODE_PARSE_ERROR );
        }

        Dataset result = new Dataset();

        Iterator<String> keys = aKeys.iterator();
        Iterator<Object> values = aValues.iterator();

        while ( keys.hasNext() )
        {
            result.put( keys.next(), values.next() );
        }

        return result;
    }
