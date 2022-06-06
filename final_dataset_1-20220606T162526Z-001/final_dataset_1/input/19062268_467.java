public static TypedLiteral<? extends Serializable> newTypedLiteral(Object value, URI datatype) {
		checkNotNull(value,LITERAL_VALUE_CANNOT_BE_NULL);
		checkNotNull(datatype,DATATYPE_CANNOT_BE_NULL);
		TypedLiteral<? extends Serializable> result=null;
		if(Datatypes.isDuration(datatype)) {
			result=coherceDuration(value);
		} else if(Datatypes.isTemporal(datatype)) {
			result=coherceDateTime(value, datatype);
		} else if(value instanceof Serializable){
			result=new ImmutableTypedLiteral<Serializable>((Serializable)value,datatype);
		} else {
			result=new ImmutableTypedLiteral<String>(value.toString(),Datatypes.STRING);
		}
		return result;
	}
