public static Object getTypedValue( String t, String value ) {

    if ( value == null ) {
      return "";
    }

    PropertyType type = PropertyType.valueOf( t );
    Object result = null;
    switch ( type ) {
      case STRING:
        result = value;
        break;
      case BOOL:
        result = getBooleanValue( value );
        break;
      case INTEGER:
        result = getIntegerValue( value );
        break;
      case FLOAT:
        result = getDoubleValue( value );
        break;
      case DATE:
        result = getDateValue( value );
        break;
      case ARRAY:
        break;
    }

    return (result == null) ? value : result;

  }
