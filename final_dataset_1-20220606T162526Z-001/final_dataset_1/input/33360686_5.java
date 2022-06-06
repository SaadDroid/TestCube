public boolean keyMatch(final Object firstInstance, final Object secondInstance) {
    if (firstInstance == null || secondInstance == null) {
      return false;
    } else if (firstInstance.getClass() != secondInstance.getClass()) {
      return false;
    }

    Map<String, Object> firstKeyFields = getValueForAnnotatedFields(firstInstance, EdmKey.class);
    Map<String, Object> secondKeyFields = getValueForAnnotatedFields(secondInstance, EdmKey.class);
    if (firstKeyFields.isEmpty() && secondKeyFields.isEmpty()) {
      throw new AnnotationRuntimeException("Both object instances does not have EdmKey fields defined ["
          + "firstClass=" + firstInstance.getClass().getName()
          + " secondClass=" + secondInstance.getClass().getName() + "].");
    }

    return keyValuesMatch(firstKeyFields, secondKeyFields);
  }
