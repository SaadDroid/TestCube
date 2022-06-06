public Crash getAnalysis() {
    StringBuilder factsBuilder = new StringBuilder();
    String placeOfCrash;

    factsBuilder.append(throwable.getLocalizedMessage());
    factsBuilder.append("\n");
    factsBuilder.append(stackTrace(throwable.getStackTrace()));
    factsBuilder.append("\n");
    if (throwable.getCause() != null) {
      factsBuilder.append("Caused By: ");
      StackTraceElement[] stackTrace = throwable.getCause().getStackTrace();
      placeOfCrash = getCrashOriginatingClass(stackTrace);
      factsBuilder.append(stackTrace(stackTrace));
    } else {
      placeOfCrash = getCrashOriginatingClass(throwable.getStackTrace());
    }

    return new Crash(placeOfCrash, throwable.getLocalizedMessage(), factsBuilder.toString());
  }
