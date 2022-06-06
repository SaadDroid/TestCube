public static void main(String[] args) throws IOException {
    checkArgument(args.length == 2, "Expected arguments: <input_dir> <output_dir>");
    Path inputPath = Paths.get(args[0]);
    Path outputPath = Paths.get(args[1]);

    // Bazel: resolve relative to current working directory. No-op if paths are already absolute.
    String wd = System.getenv("BUILD_WORKING_DIRECTORY");
    if (wd != null) {
      inputPath = Paths.get(wd).resolve(inputPath);
      outputPath = Paths.get(wd).resolve(outputPath);
    }

    Settings settings = new Settings(new String[] {"-storagebase", "/"});
    BatfishLogger logger = new BatfishLogger(BatfishLogger.LEVELSTR_WARN, false, System.out);
    settings.setLogger(logger);
    preprocessJuniper(inputPath, outputPath, settings);
  }
