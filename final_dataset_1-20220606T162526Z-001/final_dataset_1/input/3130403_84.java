static void validateFieldIsNull(PmObject pm, Field f) {
    Object value = null;
    try {
      ensureAccessibility(f);
      value = f.get(pm);
    } catch (Exception ex) {
      throw new PmRuntimeException(pm, "Can't read field '" + f.getName() + "' in class '"
          + pm.getClass().getName() + "'.", ex);
    }
    if (value != null) {
      throw new PmRuntimeException(pm, "Can't initialize field '" + f.getName() + "' in class '"
          + pm.getClass().getName() + "'.  Already has value: " + value );
    }
  }
