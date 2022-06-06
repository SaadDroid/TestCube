protected String getExtension(final String fileName) {
        String extension = "";
        final String filenameLastSegment = getFilenameLastSegment(fileName);
        final int dotPos = filenameLastSegment.lastIndexOf('.');
        if (dotPos > -1) {
            extension = filenameLastSegment.substring(dotPos);
        }
        return extension;
    }
