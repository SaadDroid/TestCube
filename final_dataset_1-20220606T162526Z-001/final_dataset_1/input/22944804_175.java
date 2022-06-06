void moveTo(File fromFile, File toFile) throws IOException {
        if (toFile.exists()) {
            if (!toFile.delete()) {
                throw new IOException("Failed to move file from " + fromFile + " to " + toFile.getAbsolutePath() +
                        ": destination file exists and cannot be removed.");
            }
        }
        if (!fromFile.renameTo(toFile)) {
            throw new IOException("Failed to move file from, " + fromFile + ", to " + toFile.getAbsolutePath());
        }
    }
