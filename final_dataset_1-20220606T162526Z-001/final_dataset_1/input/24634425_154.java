public void checkImageExists(String imageId, List<String> imagesIds) {
        if (!imagesIds.contains(imageId)) {
            throw new WebApplicationException(404);
        }
    }
