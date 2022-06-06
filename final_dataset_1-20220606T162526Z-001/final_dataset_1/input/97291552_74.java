@Override
	public void encode( @NotNull WriterContext context ) throws IOException
	{
		assert context.getType().getFamily() == Family.INTEGER;
		assert context.getValue().getKind() == Kind.INTEGER;
		writeLong( context.getWriter(), context.getValue().toIntegerValue().asLong(), TAG, context.isWriteHeader() );
	}
