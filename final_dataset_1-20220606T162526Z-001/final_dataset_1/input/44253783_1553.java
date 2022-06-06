@Override
  protected List<Archive> getClassPathArchives() throws Exception {
    List<Archive> lib = new ArrayList<>();
    for (String path : paths) {
      lib.addAll(createArchives(path));
    }
    return lib;
  }
