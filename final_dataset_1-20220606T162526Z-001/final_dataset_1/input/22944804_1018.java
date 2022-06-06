public SessionInfo refresh(Session session, boolean reset) throws SessionException {
        if (reset) {
            // all write operations should be delegated to the home server
            return remote.refresh(session, reset);
        } else {
            // handle read operations via CTS if possible
            SessionID sessionID = session.getID();
            try {
                InternalSession internalSession = readToken(sessionID);
                return sessionInfoFactory.getSessionInfo(internalSession, sessionID);
            } catch (ReadFailedSessionException e) {
                return remote.refresh(session, reset);
            }
        }
    }
