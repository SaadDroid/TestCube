public static List<MediaType> getMediaTypes(String[] values) {
        List<MediaType> supportedMimeTypes = new ArrayList<>(values.length);
        for (int i = 0; i < values.length; i++) {
            supportedMimeTypes.addAll(parseMediaTypes(values[i]));
        }
        return supportedMimeTypes;
    }
