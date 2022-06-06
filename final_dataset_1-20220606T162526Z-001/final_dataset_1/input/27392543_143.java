@Override
  public T buildObject(CommandLine cli) {
    try {
      T obj = constructObject(cli);
      applyCommandLineOptions(cli, obj);
      return obj;
    } catch (IOException exc) {
      throw new RuntimeException("Could not instantiate " + this.klazz.getSimpleName(), exc);
    }
  }
