@JsonGetter("inputhash")
    public String getContentHash() {
        return HASHER.hashString(content, StandardCharsets.UTF_8).toString();
    }
