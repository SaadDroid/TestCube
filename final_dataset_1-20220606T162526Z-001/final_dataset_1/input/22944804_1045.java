public static String getRealmFromRequest(Request request) {
        ConcurrentMap<String, Object> attributes = request.getAttributes();
        if (attributes == null || attributes.get(REALM) == null) {
            return null;
        }
        return attributes.get(REALM).toString();
    }
