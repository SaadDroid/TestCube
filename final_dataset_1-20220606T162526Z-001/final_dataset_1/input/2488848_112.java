public UpdateClause parse(String str) throws IOException {
        return parse(new ByteArrayInputStream(str.getBytes("UTF-8")), "UTF-8");
    }
