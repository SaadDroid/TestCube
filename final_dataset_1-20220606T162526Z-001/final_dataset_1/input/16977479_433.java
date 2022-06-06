static String getContentDispositionFileName(String cd) {
        if (StringUtils.isEmpty(cd)) {
            return null;
        }
        ContentDisposition c = new ContentDisposition(cd);
        String s = c.getParameter("filename");
        if (s == null) {
            s = c.getParameter("name");
        }
        return s;
    }
