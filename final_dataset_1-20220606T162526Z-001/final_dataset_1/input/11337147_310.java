public List<String> getPathSegments(final String pathInfo) throws UnsupportedEncodingException {
        final List<String> segments = new ArrayList<>();
        if (pathInfo != null) {
            for (final String segment : pathInfo.split("/")) {
                if (!segment.isEmpty()) {
                    segments.add(URLDecoder.decode(segment, "UTF-8"));
                }
            }
        }
        return segments;
    }
