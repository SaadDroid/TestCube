public String version() {
        return (String) accessor.execute("apiinfo.version", null);
    }
