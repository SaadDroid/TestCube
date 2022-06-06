@Override
	public void encode( @NotNull WriterContext context ) throws IOException
	{
		assert context.getType().getFamily() == Family.NULL;
		assert context.getValue().getKind() == Kind.NULL;
		context.writeHeader( TAG, 0 );
		// nothing to do, null value is always empty
	}
