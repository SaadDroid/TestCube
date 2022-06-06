void cleanupEventWriter() {
    try {
      if (eventWriter != null) {
        eventWriter.flush();
        eventWriter.close();
      }
    } catch (MutationsRejectedException e) {
      logger.error("Failed committing mutation batch mutation", e);
    }
  }
