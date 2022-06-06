void doLogin(String userName, String password) {
        if (isLoginAttemptExceeded()) {
            loginView.showErrorMessageForMaxLoginAttempt();
            return;
        }

        if (userName.equals("nj") && password.equals("tdd")) {
            loginView.showLoginSuccessMessage();
            resetLoginAttempt();
            return;
        }

        // increment login attempt only if it's fail
        incrementLoginAttempt();
        loginView.showErrorMessageForUserNamePassword();
    }
