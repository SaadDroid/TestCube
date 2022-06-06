public Object getValueForProperty(final Object instance, final String propertyName) throws ODataAnnotationException {
    if (instance == null) {
      return null;
    }

    Field field = getFieldForPropertyName(propertyName, instance.getClass(), true);
    if (field == null) {
      throw new ODataAnnotationException("No field for property '" + propertyName
          + "' found at class '" + instance.getClass() + "'.");
    }
    return getFieldValue(instance, field);
  }
