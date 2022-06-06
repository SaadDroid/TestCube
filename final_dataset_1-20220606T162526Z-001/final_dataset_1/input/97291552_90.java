@Override
	public void encode( @NotNull WriterContext context ) throws IOException
	{
		assert context.getType().getFamily() == Family.ENUMERATED;
		assert context.getValue().getKind() == Kind.NAME && context.getValue().toNamedValue().getReferenceKind() == Kind.INTEGER;
		IntegerBerEncoder.writeLong( context.getWriter(), context.getValue().toIntegerValue().asLong(), TAG, context.isWriteHeader() );
	}
