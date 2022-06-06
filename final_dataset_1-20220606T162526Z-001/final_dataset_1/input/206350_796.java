public static void setProperty(Object object, String nestedPropertyName, Object value)
			throws CayenneRuntimeException {
		accessor(nestedPropertyName).setValue(object, value);
	}
