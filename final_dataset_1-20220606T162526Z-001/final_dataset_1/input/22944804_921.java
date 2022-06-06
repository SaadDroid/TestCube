public void login() throws LoginException {

        loginSucceeded = false;

        if (subject == null) {
            subject = new Subject();
        }

        try {
            // module invoked in doPrivileged
            invoke(LOGIN_METHOD);
            invoke(COMMIT_METHOD);
            loginSucceeded = true;
        } catch (LoginException le) {
            try {
                invoke(ABORT_METHOD);
            } catch (LoginException le2) {
                throw le;
            }
            throw le;
        }
    }
