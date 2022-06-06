public String dropPassword(final String content) {
        String tmp = content;
        if (content != null && content.contains("password")) {
            tmp = tmp.replaceAll("[&]?password=([^&|#]*)?", "");
        }
        return tmp;
    }
