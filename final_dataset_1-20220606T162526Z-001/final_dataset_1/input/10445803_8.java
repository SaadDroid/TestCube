public Number convert( String input, Class<? extends Number> targetType, Collection<ValidationError> errors )
    {
        Number number = parse( input, errors );

        if ( errors.size() == 0 )
        {
            if ( targetType.equals( Float.class ) || targetType.equals( Float.TYPE ) )
            {
                number = new Float( number.floatValue() );
            }
            else if ( targetType.equals( Double.class ) || targetType.equals( Double.TYPE ) )
            {
                number = new Double( number.doubleValue() );
            }
            else if ( targetType.equals( BigDecimal.class ) )
            {
                number = new BigDecimal( number.doubleValue() );
            }
            else
            {
                throw new IllegalArgumentException(
                        "PercentageTypeConverter only converts to float, double and BigDecimal. "
                        + "This is because the input number is always converted to a decimal value. "
                        + "E.g. 99% -> 0.99. Type specified was: " + targetType );
            }
        }

        return number;
    }
