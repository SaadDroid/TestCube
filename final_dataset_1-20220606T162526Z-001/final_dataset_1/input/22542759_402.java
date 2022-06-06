public static File localizeResource(String fileName, LocalizeResource resource, File targetDir) throws IOException {
    File localizedResource = new File(targetDir, fileName);
    File input = getFileToLocalize(resource, targetDir);
    if (resource.isArchive()) {
      LOG.debug("Decompress file {} to {}", input, localizedResource);
      Locations.unpack(Locations.toLocation(input), localizedResource);
    } else {
      try {
        LOG.debug("Hard link file from {} to {}", input, localizedResource);
        java.nio.file.Files.createLink(Paths.get(localizedResource.toURI()), Paths.get(input.toURI()));
      } catch (Exception e) {
        LOG.debug("Copy file from {} to {}", input, localizedResource);
        Files.copy(input, localizedResource);
      }
    }
    return localizedResource;
  }
