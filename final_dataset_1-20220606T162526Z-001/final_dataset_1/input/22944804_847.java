@Override
    public boolean isBlacklisted(final Session session) throws SessionException {
        try {
            return cts.read(session.getStableStorageID()) != null;
        } catch (CoreTokenException ex) {
            DEBUG.error("CTSSessionBlacklist: error checking blacklist", ex);
            throw new SessionException(ex);
        }
    }
