public String getSecretKey() {
        return checkNotNull(configuration.getString(SECRET_KEY, null), 
                "No AWS secret key configured.").trim();
    }
