static void writeLong( @NotNull AbstractBerWriter os, long value, @Nullable Tag tag, boolean writeHeader ) throws IOException
	{
		if( tag == null && writeHeader )
			throw new IOException( "Unable to write header: tag is unavailable." );

		int size = calculateByteCount( value );
		if( writeHeader )
			os.writeHeader( tag, size );

		for( int i = size - 1; i >= 0; i-- )
			os.write( getByteByIndex( value, i ) );
	}
