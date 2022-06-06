public static ObjectMeta objectMetadata(Object obj) throws ReflectiveOperationException {
    if (obj instanceof HasMetadata) {
      return ((HasMetadata) obj).getMetadata();
    }
    try {
      Method mdField = obj.getClass().getMethod("getMetadata");
      return (ObjectMeta) mdField.invoke(obj);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      throw new ReflectiveOperationException(e);
    }
  }
