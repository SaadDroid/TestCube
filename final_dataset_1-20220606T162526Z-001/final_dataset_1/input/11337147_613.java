public void validate(File pageFolder) throws InvalidPageZipContentException {
        final File[] rootFiles = pageFolder.listFiles();
        if (rootFiles == null) {
            throw new InvalidPageZipContentException(
                    "Content not found.");
        }
        Properties pageProperties = Stream.of(rootFiles)
                .filter(file -> file.getName().matches(PAGE_PROPERTIES))
                .findFirst()
                .map(this::loadProperties)
                .orElseThrow(() -> new InvalidPageZipContentException(String.format("%s descriptor is missing.",PAGE_PROPERTIES)));

        String contentType = pageProperties.getProperty(CustomPageService.PROPERTY_CONTENT_TYPE);
        Optional<File> resouresFolder = Stream.of(rootFiles)
                .filter(file -> file.getName().matches(CustomPageService.RESOURCES_PROPERTY))
                .findFirst();
        if (Objects.equals(contentType, ContentType.THEME)) {
            if (!resouresFolder.filter(resources -> new File(resources, THEME_CSS).exists()).isPresent()) {
                throw new InvalidPageZipContentException(String.format("%s is missing.",THEME_CSS));
            }
        } else if (!Objects.equals(contentType, ContentType.API_EXTENSION)) {
            if (Stream.of(rootFiles)
                    .noneMatch(file -> file.getName().matches(INDEX_HTML) || file.getName().matches(INDEX_GROOVY))
                    && !resouresFolder.filter(resources -> new File(resources, INDEX_HTML).exists()
                            || new File(resources, INDEX_GROOVY).exists()).isPresent()) {
                throw new InvalidPageZipContentException(String.format("%s or %s is missing.",INDEX_HTML,INDEX_GROOVY));
            }
        }
    }
