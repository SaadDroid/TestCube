@Override
    public void blacklist(final Session session) throws SessionException {
        DEBUG.message("CTSSessionBlacklist: Blacklisting session: {}", session);

        try {
            final Token token = new Token(session.getStableStorageID(), TokenType.SESSION_BLACKLIST);
            token.setExpiryTimestamp(timeOf(session.getBlacklistExpiryTime(purgeDelayMs)));
            token.setAttribute(BLACKLIST_TIME_FIELD, now());
            token.setAttribute(SERVER_ID_FIELD, localServerId);
            cts.create(token);
        } catch (CoreTokenException ex) {
            DEBUG.error("CTSSessionBlacklist: Error blacklisting session", ex);
            throw new SessionException(ex);
        }

        notifyListeners(session);
    }
