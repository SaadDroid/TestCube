@Override
    public void unzip(String inputFile, String destination) throws IOException {
        // TODO: barteks - use system unzip instead of java zip stream.
        FileInputStream fis = new FileInputStream(inputFile);
        ZipEntry entry;
        int entries = 0;
        long total = BUFFER_SIZE;
        log.info("Extracting " + this.logging.removeCRLF(inputFile) + " into " + destination);

        File zipParentDir = new File(inputFile).getParentFile();

        try(ZipInputStream zis = new ZipInputStream(new BufferedInputStream(fis));) {
            while ((entry = zis.getNextEntry()) != null) {
                int count;
                byte[] data = new byte[BUFFER_SIZE];
                // Write the files to the disk, but ensure that the filename is valid,
                // and that the file is not insanely big

                String filename = entry.getName();
                if (zipParentDir.isDirectory()) {
                    filename = Paths.get(zipParentDir.toString(), entry.getName()).toString();
                }

                String name = preventPathTraversal(filename, destination);
                if (entry.isDirectory()) {
                    new File(name).mkdir();
                    continue;
                }
                log.info("Extracting " + this.logging.removeCRLF(name));
                FileOutputStream fos = new FileOutputStream(name);
                BufferedOutputStream dest = new BufferedOutputStream(fos, BUFFER_SIZE);
                count = zis.read(data, 0, BUFFER_SIZE);
                while (total <= FILE_SIZE && count != -1) {
                    dest.write(data, 0, count);
                    total += count;
                    count = zis.read(data, 0, BUFFER_SIZE);
                }
                dest.flush();
                dest.close();
                zis.closeEntry();
                entries++;
                if (entries > FILE_LIMIT) {
                    throw new IllegalStateException("Archive has too many files.");
                }
                if (total > FILE_SIZE) {
                    throw new IllegalStateException("Archive is too big.");
                }
            }
        }
    }
