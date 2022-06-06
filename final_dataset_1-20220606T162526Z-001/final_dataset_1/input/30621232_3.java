public static boolean isFileMusic(File file) {
        String fileName = file.getName();
        if (!fileName.contains(".") || fileName.lastIndexOf('.') <= 0) {
            return false;
        }

        String extension = fileName.substring(fileName.lastIndexOf('.') + 1);
        return isMimeTypeAudio(MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension));
    }
