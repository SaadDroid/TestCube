public void auditLoginFailure(LoginState loginState) {
        auditLoginFailure(loginState, findFailureReason(loginState));
    }
