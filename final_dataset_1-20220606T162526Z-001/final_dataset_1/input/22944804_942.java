public void auditLoginSuccess(LoginState loginState) {
        String realm = getRealmFromState(loginState);

        if (eventPublisher.isAuditing(realm, AUTHENTICATION_TOPIC, AM_LOGIN_COMPLETED)) {
            String moduleName = null;
            String userDN = null;
            if (loginState != null) {
                moduleName = loginState.getAuthModuleNames();
                userDN = loginState.getUserDN();
            }

            AMAuthenticationAuditEventBuilder builder = eventFactory.authenticationEvent(realm)
                    .transactionId(getTransactionIdValue())
                    .component(AUTHENTICATION)
                    .eventName(AM_LOGIN_COMPLETED)
                    .result(SUCCESSFUL)
                    .entry(getAuditEntryDetail(moduleName, loginState))
                    .trackingIds(getTrackingIds(loginState))
                    .userId(userDN == null ? "" : userDN)
                    .principal(DNUtils.DNtoName(userDN));

            eventPublisher.tryPublish(AUTHENTICATION_TOPIC, builder.toEvent());
        }
    }
