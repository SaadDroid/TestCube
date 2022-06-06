public static boolean isValidName(String src) {
    // Path must be absolute.
    if (!src.startsWith(Path.SEPARATOR)) {
      return false;
    }

    // Check for ".." "." ":" "/"
    String[] components = StringUtils.split(src, '/');
    for (int i = 0; i < components.length; i++) {
      String element = components[i];
      if (element.equals(".")  ||
          (element.contains(":"))  ||
          (element.contains("/") || element.equals(".."))) {
        return false;
      }
      // The string may start or end with a /, but not have
      // "//" in the middle.
      if (element.isEmpty() && i != components.length - 1 &&
          i != 0) {
        return false;
      }
    }
    return true;
  }
