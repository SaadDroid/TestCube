@Override
    @ActionEvent(eventType = EventTypes.EVENT_ACCOUNT_DELETE, eventDescription = "deleting account", async = true)
    // This method deletes the account
    public boolean deleteUserAccount(final long accountId) {

        final CallContext ctx = CallContext.current();
        final long callerUserId = ctx.getCallingUserId();
        final Account caller = ctx.getCallingAccount();

        // If the user is a System user, return an error. We do not allow this
        final AccountVO account = _accountDao.findById(accountId);

        if (account == null || account.getRemoved() != null) {
            if (account != null) {
                s_logger.info("The account:" + account.getAccountName() + " is already removed");
            }
            return true;
        }

        // don't allow removing Project account
        if (account == null || account.getType() == Account.ACCOUNT_TYPE_PROJECT) {
            throw new InvalidParameterValueException("The specified account does not exist in the system");
        }

        checkAccess(caller, null, true, account);

        // don't allow to delete default account (system and admin)
        if (account.isDefault()) {
            throw new InvalidParameterValueException("The account is default and can't be removed");
        }

        // Account that manages project(s) can't be removed
        final List<Long> managedProjectIds = _projectAccountDao.listAdministratedProjectIds(accountId);
        if (!managedProjectIds.isEmpty()) {
            final StringBuilder projectIds = new StringBuilder();
            for (final Long projectId : managedProjectIds) {
                projectIds.append(projectId + ", ");
            }

            throw new InvalidParameterValueException("The account id=" + accountId + " manages project(s) with ids " + projectIds + "and can't be removed");
        }

        CallContext.current().putContextParameter(Account.class, account.getUuid());

        return deleteAccount(account, callerUserId, caller);
    }
