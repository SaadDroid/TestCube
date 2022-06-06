public static String getPortletId(String requestURI) {
        Matcher matcher = Pattern.compile("/p/([^/]+)/").matcher(requestURI);
        matcher.find();
        return matcher.group(1);
    }
