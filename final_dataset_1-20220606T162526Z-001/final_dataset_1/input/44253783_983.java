public static File toFile(String s) throws IOException, URISyntaxException {
    try {
      return createFileReference(createUrlFromString(s, true));
    } catch (IllegalArgumentException e) {
      // Catch it from createUrlFromString(), since it's probably c:/file.
      return new File(s);
    }
  }
