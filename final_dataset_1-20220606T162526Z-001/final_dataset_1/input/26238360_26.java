@Override
    public BufferedImage convert( String aValue ) throws SdiException
    {
        if ( !StringUtils.hasText( aValue ) )
        {
            myLog.debug( "Given value is null" );
            return null;
        }

        byte[] binary;

        try
        {
            binary = Hex.decodeHex( aValue.toCharArray() );
        }
        catch ( DecoderException t )
        {
            throw new SdiException( "Cannot convert input value to binary array: " + aValue, t,
                                    SdiException.EXIT_CODE_PARSE_ERROR );
        }

        ByteArrayInputStream bais = new ByteArrayInputStream( binary );

        return super.convert( bais );
    }
