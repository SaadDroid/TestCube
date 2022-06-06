@Override
    public Boolean convert( String aValue ) throws SdiException
    {
        if ( !StringUtils.hasText( aValue ) )
        {
            myLog.debug( "Given value is null" );
            return null;
        }

        String value = aValue.trim().toLowerCase();

        if ( trueValues.contains( value ) )
        {
            return Boolean.TRUE;
        } // if

        if ( falseValues.contains( value ) )
        {
            return Boolean.FALSE;
        } // if

        try
        {
            return myConversionService.convert( value, Boolean.class );
        }
        catch ( Throwable t )
        {
            throw new SdiException( "Problems converting boolean value " + aValue, t, SdiException.EXIT_CODE_CONFIG_ERROR );
        }
    }
