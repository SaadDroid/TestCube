static Object resolveValue(PmObject pm, AccessibleObject target, PathResolver resolver) {
    Object value = null;
    try {
      value = resolver.getValue(pm);
    } catch (RuntimeException ex) {
      throw new PmRuntimeException(pm, "Unable to resolve dependency injection reference to '" + resolver + "' for: " + target, ex);
    }
    return value;
  }
