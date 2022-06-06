public static <T> T instantiate(Class<T> type) {
    try {
      Constructor<T> defaultConstructor = type.getDeclaredConstructor();
      defaultConstructor.setAccessible(true);
      return defaultConstructor.newInstance();
    } catch (NoSuchMethodException e) {
      throw new IllegalStateException(
          "Unable to create an instance of " + type.getName() + " has no default constructor", e);
    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
      throw new IllegalStateException("Unable to create an instance of " + type.getName(), e);
    }
  }
