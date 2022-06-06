@Override
	public void encode( @NotNull WriterContext context ) throws IOException, Asn1Exception
	{
		assert context.getType().getFamily() == Family.SET_OF;
		assert context.getValue().getKind() == Kind.COLLECTION || context.getValue().getKind() == Kind.NAMED_COLLECTION;

		if( !context.isWriteHeader() )
			SequenceOfBerEncoder.writeCollection( context );
		else if( context.isBufferingAvailable() )
		{
			context.startBuffer( -1 );
			SequenceOfBerEncoder.writeCollection( context );
			context.stopBuffer( SetBerEncoder.TAG );
		}
		else if( context.getRules() == BerRules.DER )
			throw new Asn1Exception( "Buffering is required for DER rules" );
		else
		{
			context.writeHeader( SetBerEncoder.TAG, -1 );
			SequenceOfBerEncoder.writeCollection( context );
			context.write( 0 );
			context.write( 0 );
		}
	}
