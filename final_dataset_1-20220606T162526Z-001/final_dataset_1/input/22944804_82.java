@Override
    public int process(Callback[] callbacks, int state) throws LoginException {

        switch (state) {
        case ISAuthConstants.LOGIN_START: {
            final Subject clientSubject = new Subject();
            MessageInfo messageInfo = prepareMessageInfo(getHttpServletRequest(), getHttpServletResponse());
            if (process(messageInfo, clientSubject, callbacks)) {
                AuthStatus authStatus = serverAuthModule.validateRequest(messageInfo, clientSubject, null);

                if (AuthStatus.SUCCESS.equals(authStatus)) {
                    // The module has successfully authenticated the client.
                    debug.message("Successfully validated request");
                    return ISAuthConstants.LOGIN_SUCCEED;
                } else if (AuthStatus.SEND_SUCCESS.equals(authStatus)) {
                    // The module may have completely/partially/not authenticated the client.
                    debug.message("Successfully validated request");
                    return ISAuthConstants.LOGIN_SUCCEED;
                } else if (AuthStatus.SEND_FAILURE.equals(authStatus)) {
                    // The module has failed to authenticate the client.
                    debug.error("The underlying JASPI Authentication Module has failed.");
                    throw new AuthLoginException(resourceBundleName, "authFailed", null);
                } else if (AuthStatus.SEND_CONTINUE.equals(authStatus)) {
                    // The module has not completed authenticating the client.
                    debug.message("JASPI Authentication Module returned SEND_CONTINUE so ignoring the module");
                    return ISAuthConstants.LOGIN_IGNORE;
                }
            }
        }
        default: {
            throw new AuthLoginException(resourceBundleName, "incorrectState", null);
        }
        }
    }
