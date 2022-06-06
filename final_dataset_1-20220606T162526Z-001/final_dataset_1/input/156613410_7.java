static boolean include(String annotationType) {
    if (annotationType.startsWith("lombok.")) {
      return false;
    }
    return !EXCLUDED_ANNOTATIONS.contains(annotationType);
  }
