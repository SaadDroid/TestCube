public boolean isLoggable(Level level) {
    if (level.intValue() >= Level.SEVERE.intValue()) {
      return slf4jLogger.isErrorEnabled();
    } else if (level.intValue() >= Level.WARNING.intValue()) {
      return slf4jLogger.isWarnEnabled();
    } else if (level.intValue() >= Level.CONFIG.intValue()) {
      return slf4jLogger.isInfoEnabled();
    } else if (level.intValue() >= Level.FINE.intValue()) {
      return slf4jLogger.isDebugEnabled();
    } else {
      return slf4jLogger.isTraceEnabled();
    }
  }
