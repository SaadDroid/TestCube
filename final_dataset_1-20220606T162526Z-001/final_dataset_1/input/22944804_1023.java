public void logout(Session session) throws SessionException {

        // See OPENAM-4543.  The check for a local session should be removed if it proves to be a performance
        // bottleneck.  As Peter points out, because we "know" this is a remote session, we will force checkSessionLocal
        // to look in three hashtables, then do a couple of string compares... all for peace of mind.
        //
        SessionID sessionID = session.getID();
        if (sessionService.checkSessionLocal(sessionID)) {
            throw new SessionException("CTSOperations received a local session (only remote sessions expected)");
        }
        remote.logout(session);
    }
