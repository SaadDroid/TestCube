public static Object getProperty(Object object, String nestedPropertyName) throws CayenneRuntimeException {
		return accessor(nestedPropertyName).getValue(object);
	}
