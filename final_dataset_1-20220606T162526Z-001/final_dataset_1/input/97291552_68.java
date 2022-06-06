static byte[] toByteArray( long value )
	{
		int size = calculateByteCount( value );
		byte[] result = new byte[size];
		for( int i = size - 1, position = 0; i >= 0; i--, position++ )
			result[position] = getByteByIndex( value, i );

		return result;
	}
