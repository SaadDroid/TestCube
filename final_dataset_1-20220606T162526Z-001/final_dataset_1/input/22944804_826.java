@Override
    public String getProperty(String name) throws SSOException {
        try {
            return session.getProperty(name);
        } catch (SessionException e) {
            throw new SSOException(e);
        }
    }
