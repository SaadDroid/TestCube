@Override
    public boolean configure(final String ignoredName, final Map<String, Object> params) throws ConfigurationException {

        this.name = (String) params.get("name");
        if (this.name == null) {
            throw new ConfigurationException("Unable to find name");
        }

        this.guid = (String) params.get("guid");
        if (this.guid == null) {
            throw new ConfigurationException("Unable to find the guid");
        }

        this.zoneId = (String) params.get("zoneId");
        if (this.zoneId == null) {
            throw new ConfigurationException("Unable to find zone");
        }

        final String ips = (String) params.get("ip");
        if (ips == null) {
            throw new ConfigurationException("Unable to find IPs");
        }

        final String adminuser = (String) params.get("adminuser");
        if (adminuser == null) {
            throw new ConfigurationException("Unable to find admin username");
        }

        final String adminpass = (String) params.get("adminpass");
        if (adminpass == null) {
            throw new ConfigurationException("Unable to find admin password");
        }

        this.niciraNvpUtilities = NiciraNvpUtilities.getInstance();
        this.retryUtility = CommandRetryUtility.getInstance();
        this.retryUtility.setServerResource(this);

        try {
            for (final String ip : ips.split(",")) {
                this.niciraNvpApis.add(createNiciraNvpApi(ip, adminuser, adminpass));
            }
        } catch (final CosmicRESTException e) {
            throw new ConfigurationException("Could not create a Nicira Nvp API client: " + e.getMessage());
        }

        return true;
    }
