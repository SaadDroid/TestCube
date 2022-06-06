@Override
	public void encode( @NotNull WriterContext context ) throws IOException, Asn1Exception
	{
		assert context.getType().getFamily() == Family.OID;
		assert context.getValue().getKind() == Kind.OID;

		if( !context.isWriteHeader() )
			writeObjectIDImpl( context.getWriter(), context.getValue().toObjectIdentifierValue() );
		else if( context.isBufferingAvailable() )
		{
			context.startBuffer( -1 );
			writeObjectIDImpl( context.getWriter(), context.getValue().toObjectIdentifierValue() );
			context.stopBuffer( TAG );
		}
		else
			throw new Asn1Exception( "Buffering is required for ObjectIdentifier" );
	}
