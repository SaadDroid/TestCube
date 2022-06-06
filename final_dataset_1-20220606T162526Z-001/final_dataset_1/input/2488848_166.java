public static boolean isContainerMembershipProperty(UID predicate) {
        return NS.equals(predicate.ns()) && isContainerMembershipPropertyLocalName(predicate.ln());
    }
