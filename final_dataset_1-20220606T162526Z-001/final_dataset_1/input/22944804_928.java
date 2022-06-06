@Override
    public boolean activateSession(final LoginState loginState, final SessionService sessionService,
                                   final InternalSession authSession, final Subject subject, final Object loginContext)
            throws AuthException {

        //create our new session - the loginState needs this session as it's the one we'll be passing back to the user
        final InternalSession session = createSession(sessionService, loginState);
        loginState.setSession(session);

        return updateSessions(session, loginState, session, authSession, sessionService, subject, loginContext);
    }
