public void validateReferralPrivilege(ReferralPrivilege referralPrivilege) throws EntitlementException {
        Set<String> referralPrivilegeRealms = referralPrivilege.getRealms();
        realmValidator.validateRealms(referralPrivilegeRealms);
    }
