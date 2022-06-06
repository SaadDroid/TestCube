public void startLogin(String userName, String password, boolean fromReSync) {
        hasGoneToNextPage = false;
        if (StringUtils.EMPTY.equals(userName.trim())) {
            view.showUserNameEmpty();
            return;
        }
        if (StringUtils.EMPTY.equals(password)) {
            view.showPasswordEmpty();
            return;
        }
        view.loading();

        User user = new User(userName.trim(), password);
        if (!isRoboUniTest()) {
            new InternetCheck().execute(checkNetworkConnected(user, fromReSync));
        } else {
            internetCheck.execute(checkNetworkConnected(user, fromReSync));
        }
    }
