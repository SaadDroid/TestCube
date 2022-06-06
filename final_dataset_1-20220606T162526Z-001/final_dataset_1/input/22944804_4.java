boolean isPolicyUpgradable(Privilege policy) {
        return isSubjectConditionUpgradable(policy.getSubject())
                && isEnvironmentConditionUpgradable(policy.getCondition());
    }
