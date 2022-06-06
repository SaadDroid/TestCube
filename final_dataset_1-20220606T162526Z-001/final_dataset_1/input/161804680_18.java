public SpiCardAccountDetails enrichCardAccountDetailsWithOwnerName(SpiCardAccountDetails cardAccountDetails) {
        String accountOwnerNameFromLedgers = getAccountOwnerNameFromLedgers(cardAccountDetails.getResourceId());
        cardAccountDetails.setOwnerName(accountOwnerNameFromLedgers);
        return cardAccountDetails;
    }
