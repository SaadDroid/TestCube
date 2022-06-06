String processAcceptMediaType(String acceptMediaType) {
        return StringUtils.isBlank(acceptMediaType)
                       || WILDCARD_ACCEPT_HEADER.equals(acceptMediaType)
                       || acceptMediaType.contains(",") ? DEFAULT_ACCEPT_MEDIA_TYPE : acceptMediaType;
    }
