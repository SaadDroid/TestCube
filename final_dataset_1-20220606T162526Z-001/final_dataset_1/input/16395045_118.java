public static void jarDir(File dir, String relativePath, ZipOutputStream zos)
    throws IOException {
    Preconditions.checkNotNull(relativePath, "relativePath");
    Preconditions.checkNotNull(zos, "zos");

    // by JAR spec, if there is a manifest, it must be the first entry in the
    // ZIP.
    File manifestFile = new File(dir, JarFile.MANIFEST_NAME);
    ZipEntry manifestEntry = new ZipEntry(JarFile.MANIFEST_NAME);
    if (!manifestFile.exists()) {
      zos.putNextEntry(manifestEntry);
      new Manifest().write(new BufferedOutputStream(zos));
      zos.closeEntry();
    } else {
      InputStream is = new FileInputStream(manifestFile);
      copyToZipStream(is, manifestEntry, zos);
    }
    zos.closeEntry();
    zipDir(dir, relativePath, zos, true);
    zos.close();
  }
