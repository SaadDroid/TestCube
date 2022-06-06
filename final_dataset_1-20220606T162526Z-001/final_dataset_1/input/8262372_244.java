public static void closeHRegion(final HRegion r) throws IOException {
    if (r == null) return;
    r.close();
    if (r.getLog() == null) return;
    r.getLog().closeAndDelete();
  }
