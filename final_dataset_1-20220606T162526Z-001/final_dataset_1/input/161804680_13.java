public SpiAccountDetails enrichAccountDetailsWithOwnerName(SpiAccountDetails accountDetails) {
        String accountOwnerNameFromLedgers = getAccountOwnerNameFromLedgers(accountDetails.getResourceId());
        accountDetails.setOwnerName(accountOwnerNameFromLedgers);
        return accountDetails;
    }
