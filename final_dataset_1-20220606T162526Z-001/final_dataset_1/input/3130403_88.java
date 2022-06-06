static void validateGetterReturnsNull(PmObject pm, Method getter) {
    if (getter == null) {
      // don't check if there is no getter.
      return;
    }
    Object value = null;
    try {
      value = getter.invoke(pm);
    } catch (Exception ex) {
      throw new PmRuntimeException(pm, "Can't invoke getter '" + getter.getName() + "' in class '"
          + pm.getClass().getName() + "'.", ex);
    }
    if (value != null) {
      throw new PmRuntimeException(pm, "Can't perform @PmInject for '" + PrefixUtil.propNameForGetter(getter.getName()) + "'. It already has value: " + value );
    }
  }
