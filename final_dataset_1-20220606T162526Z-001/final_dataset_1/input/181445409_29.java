@Override
    protected void applyHeaders() {
        HttpHeaders headers = getHeaders();
        if (!headers.containsKey(HttpHeaders.CONTENT_LENGTH)) {
            logger.debug("Setting chunked request");
            delegate.setChunked(true);
        }
        headers.forEach(delegate::putHeader);
    }
