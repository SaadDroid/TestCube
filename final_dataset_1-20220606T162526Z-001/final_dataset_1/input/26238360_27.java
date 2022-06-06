@Override
    public Date convert( String aValue ) throws SdiException
    {
        if ( !StringUtils.hasText( aValue ) )
        {
            myLog.debug( "Given value is null" );
            return null;
        }

        DateFormat df;
        if ( StringUtils.hasText( myDatePattern ) )
        {
            df = new SimpleDateFormat( myDatePattern );
        }
        else
        {
            df = new SimpleDateFormat();
        } // if..else StringUtils.hasText( myPattern )

        Date result;

        try
        {
            result = df.parse( aValue );
        }
        catch ( ParseException t )
        {
            throw new SdiException( "Problems converting date: " + aValue
                                    + "; myDatePattern: " + myDatePattern,
                                    SdiException.EXIT_CODE_PARSE_ERROR );
        }

        return result;
    }
