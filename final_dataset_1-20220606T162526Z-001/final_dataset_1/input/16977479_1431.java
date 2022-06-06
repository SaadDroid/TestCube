public static void updatePath(Message m, String path) {
        String baseAddress = getBaseAddress(m);
        boolean pathSlash = path.startsWith("/");
        boolean baseSlash = baseAddress.endsWith("/");
        if (pathSlash && baseSlash) {
            path = path.substring(1);
        } else if (!pathSlash && !baseSlash) {
            path = "/" + path;
        }
        m.put(Message.REQUEST_URI, baseAddress + path);
        m.remove(REQUEST_PATH_TO_MATCH);
        m.remove(REQUEST_PATH_TO_MATCH_SLASH);
    }
