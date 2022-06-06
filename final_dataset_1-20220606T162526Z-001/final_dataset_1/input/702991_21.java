public static void closeDocumentQuietly(COSDocument document) {
    try {
      if (document != null) {
        document.close();
      }
    } catch (IOException e) {
      logger.warn("Error occured during the close of a COSDocument : "
          + e.getMessage());
    }
  }
