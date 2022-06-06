String normalizeNotePath(String notePath) throws IOException {
    if (StringUtils.isBlank(notePath)) {
      notePath = "/Untitled Note";
    }
    if (!notePath.startsWith("/")) {
      notePath = "/" + notePath;
    }

    notePath = notePath.replace("\r", " ").replace("\n", " ");
    int pos = notePath.lastIndexOf("/");
    if ((notePath.length() - pos) > 255) {
      throw new IOException("Note name must be less than 255");
    }

    if (notePath.contains("..")) {
      throw new IOException("Note name can not contain '..'");
    }
    return notePath;
  }
