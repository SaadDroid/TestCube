@Override public void handleManagedResources( Bundle blueprintBundle ) {
    File to = getOutputDirectory( blueprintBundle );
    writeFilesToDisk( blueprintBundle, BUNDLE_MANAGED_RESOURCES_DIR, to );
  }
