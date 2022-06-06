public static void registerComparable(Class<? extends WritableComparable> clazz) {
    int code = clazz.hashCode();
    if (code < 0) {
      code = -code;
    }
    if (code < WRITABLE_CODES.size()) {
      code += WRITABLE_CODES.size();
    }
    registerComparable(clazz, code);
  }
