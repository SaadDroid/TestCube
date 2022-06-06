public MediaType getContentType() {
        Optional<MediaType> optionalType = toContentType(Files.getFileExtension(filename));
        Optional<Charset> targetCharset = toCharset(optionalType.orElse(null));

        MediaType type = optionalType.orElse(DEFAULT_CONTENT_TYPE_WITH_CHARSET);
        if (targetCharset.isPresent() && !type.charset().equals(targetCharset)) {
            return type.withCharset(targetCharset.get());
        }

        return type;
    }
