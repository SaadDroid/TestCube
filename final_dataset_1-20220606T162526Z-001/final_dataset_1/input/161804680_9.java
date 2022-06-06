public boolean shouldContainOwnerName(IbanAccountReference ibanAccountReference, SpiAccountAccess accountAccess) {
        SpiAdditionalInformationAccess spiAdditionalInformationAccess = accountAccess.getSpiAdditionalInformationAccess();
        if (spiAdditionalInformationAccess != null && spiAdditionalInformationAccess.getOwnerName() != null) {
            List<SpiAccountReference> ownerName = spiAdditionalInformationAccess.getOwnerName();
            return ownerName.isEmpty() || containsAccountReferenceWithIban(ownerName, ibanAccountReference.getIban(), ibanAccountReference.getCurrency());
        }

        AccountAccessType allAccountsWithOwnerName = AccountAccessType.ALL_ACCOUNTS_WITH_OWNER_NAME;
        List<AccountAccessType> accountAccessTypes = Arrays.asList(accountAccess.getAvailableAccounts(), accountAccess.getAvailableAccountsWithBalance(), accountAccess.getAllPsd2());
        return accountAccessTypes.contains(allAccountsWithOwnerName);
    }
