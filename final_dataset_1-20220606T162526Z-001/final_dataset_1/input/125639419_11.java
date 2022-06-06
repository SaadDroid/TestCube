public static boolean isEmpty (final File imageFile) throws IOException {
        return isEmpty(ImageIO.read(imageFile));
    }
