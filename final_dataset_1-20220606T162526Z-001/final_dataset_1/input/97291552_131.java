@SuppressWarnings( "unchecked" )
	@Override
	public TypeMapper mapType( Type type, TypeMetadata metadata )
	{
		if( !isSupportedFor( type ) )
			throw new IllegalArgumentException( "Only enum types allowed" );

		return mapEnum( (Class<Enum<?>>)type );
	}
