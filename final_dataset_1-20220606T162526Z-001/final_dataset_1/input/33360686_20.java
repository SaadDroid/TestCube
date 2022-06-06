public void setValueForProperty(final Object instance, final String propertyName, final Object propertyValue) {
    if (instance != null) {
      Field field = getFieldForPropertyName(propertyName, instance.getClass(), true);
      if (field != null) {
        setFieldValue(instance, field, propertyValue);
      }
    }
  }
