@Override
  public boolean accept(File pathname) {
    try {
      Date filterDate = filterDate();
      Date fileDate = new Date(pathname.lastModified());
      return fileDate.before(filterDate);
    }
    catch (Exception e) {
      return false;
    }
  }
