@NotNull
	@Override
	public Value toAsn1( @NotNull ValueFactory factory, @NotNull Object value )
	{
		if( isFloat() && isAssignableToFloat( value ) )
			return factory.real( (Float)value );

		if( isDouble() && isAssignableToDouble( value ) )
			return factory.real( (Double)value );

		if( isBigDecimal() && Objects.equals( value.getClass(), BigDecimal.class ) )
			return factory.real( (BigDecimal)value );

		throw new IllegalArgumentException( "Unable to convert value: " + value );
	}
