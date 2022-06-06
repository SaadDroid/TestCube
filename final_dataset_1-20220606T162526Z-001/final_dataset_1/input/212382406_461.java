public static ContainerData readContainerFile(File containerFile)
      throws IOException {
    Preconditions.checkNotNull(containerFile, "containerFile cannot be null");
    try (FileInputStream inputFileStream = new FileInputStream(containerFile)) {
      return readContainer(inputFileStream);
    }

  }
