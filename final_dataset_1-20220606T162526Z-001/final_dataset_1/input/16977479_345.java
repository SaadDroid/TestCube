public void handleMessage(final Message message) {
        if (allowNamedPrincipals) {
            SecurityContext sc = message.get(SecurityContext.class);
            if (sc != null && sc.getUserPrincipal() != null
                && sc.getUserPrincipal().getName() != null) {
                return;
            }
        }

        CallbackHandler handler = getFirstCallbackHandler(message);

        if (handler == null && !allowAnonymous) {
            throw new AuthenticationException("Authentication required but no authentication information was supplied");
        }

        try {
            LoginContext ctx = new LoginContext(getContextName(), null, handler, loginConfig);
            ctx.login();
            Subject subject = ctx.getSubject();
            String name = getUsername(handler);
            message.put(SecurityContext.class, createSecurityContext(name, subject));

            // Run the further chain in the context of this subject.
            // This allows other code to retrieve the subject using pure JAAS
            if (useDoAs) {
                Subject.doAs(subject, new PrivilegedAction<Void>() {

                    @Override
                    public Void run() {
                        InterceptorChain chain = message.getInterceptorChain();
                        if (chain != null) {
                            message.put("suspend.chain.on.current.interceptor", Boolean.TRUE);
                            chain.doIntercept(message);
                        }
                        return null;
                    }
                });
            }

        } catch (LoginException ex) {
            String errorMessage = "Authentication failed: " + ex.getMessage();
            LOG.log(Level.FINE, errorMessage, ex);
            if (reportFault) {
                AuthenticationException aex = new AuthenticationException(errorMessage);
                aex.initCause(ex);
                throw aex;

            }
            throw new AuthenticationException("Authentication failed (details can be found in server log)");
        }
    }
