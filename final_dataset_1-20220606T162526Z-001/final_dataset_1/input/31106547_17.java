@JsonIgnore
    public String getGraphiteHost() {
        return splitBaseUrl(graphiteUrl)[2];
    }
