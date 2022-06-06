public void validateSession(InternalSession internalSession, SessionID sid)
            throws SessionException {
        if (!sid.equals(internalSession.getID())
                && internalSession.getRestrictionForToken(sid) == null) {
            throw new IllegalArgumentException("Session id mismatch");
        }

        if (internalSession.getState() != VALID) {
            if (internalSession.getTimeLeftBeforePurge() > 0) {
                throw new SessionTimedOutException(MessageFormat.format(ERROR_FORMAT,
                        SessionBundle.getString(SESSION_TIMED_OUT),
                        sid));
            } else {
                throw new SessionException(MessageFormat.format(ERROR_FORMAT,
                        SessionBundle.getString(INVALID_SESSION_STATE),
                        sid));
            }
        }
    }
