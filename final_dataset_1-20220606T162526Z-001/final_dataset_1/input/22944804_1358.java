public static PolicySet privilegesToPolicySet(String realm, Collection<Privilege> privileges) {
        PolicySet policySet = null;
        try {
            policySet = privilegesToPolicySetInternal(realm, privileges);
        } catch (JAXBException je) {
            //TODO: log error, jaxbexception
        }
        return policySet;
    }
