public String upload(String filename) {
        if (StringUtil.isBlank(filename)) {
            throw new IllegalArgumentException("Empty path");
        }
        return upload(new File(filename));
    }
