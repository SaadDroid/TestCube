static boolean containsMultipleDocuments(String specFile) {
    final long validDocumentCount = splitSpecFile(specFile).stream().filter(Serialization::validate)
      .count();
    return validDocumentCount > 1;
  }
