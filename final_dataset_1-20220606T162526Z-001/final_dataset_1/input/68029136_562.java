public String getImportedResourceBacklink(){
        StringBuilder sb = new StringBuilder();
        sb.append(ConfigurationService.getProperty(ConfigKey.EXTERNAL_RESOURCE_BACKLINK_SCHEMA, "http"));
        sb.append("://");
        sb.append(ConfigurationService.getProperty(ConfigKey.EXTERNAL_RESOURCE_BACKLINK_HOST, "localhost:8080"));
        sb.append(BACKLINK_URL);
        return sb.toString();
    }
