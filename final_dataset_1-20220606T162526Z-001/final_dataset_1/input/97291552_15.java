@Override
	public void encode( @NotNull WriterContext context ) throws IOException, Asn1Exception
	{
		assert context.getType().getFamily() == Family.GENERALIZED_TIME;
		assert context.getValue().getKind() == Kind.TIME;
		Instant instant = context.getValue().toDateValue().asInstant();
		boolean optimize = context.getRules() != BerRules.DER;
		String content = TimeUtils.formatInstant( instant, TimeUtils.GENERALIZED_TIME_FORMAT, optimize );
		byte[] bytes = content.getBytes( TimeUtils.CHARSET );
		context.writeHeader( TAG, bytes.length );
		context.write( bytes );
	}
