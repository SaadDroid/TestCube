static boolean isTextFile(String file) {
    return TEXT_FILE_EXTENSIONS.stream().anyMatch(file::endsWith);
  }
