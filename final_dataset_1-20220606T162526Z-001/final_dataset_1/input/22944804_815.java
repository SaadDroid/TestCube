@Override
    public InetAddress getIPAddress() throws SSOException {
        try {
            String host = session.getProperty(ISAuthConstants.HOST);
            if (StringUtils.isBlank(host)) {
                throw new SSOException(SSOProviderBundle.rbName, "ipaddressnull", null);
            }
            return InetAddress.getByName(host);
        } catch (Exception e) {
            DEBUG.error("Can't get client's IPAddress", e);
            throw new SSOException(e);
        }
    }
