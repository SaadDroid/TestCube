protected void setupAccountOwner() {
        if (networkModel.isNetworkSystem(guestNetwork) || guestNetwork.getGuestType() == GuestType.Shared) {
            owner = accountMgr.getAccount(Account.ACCOUNT_ID_SYSTEM);
        }
    }
