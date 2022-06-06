public boolean isUserInRole(String role) {
        if (subject != null) {
            for (Principal principal : subject.getPrincipals()) {
                if (isGroupPrincipal(principal) 
                    && checkGroup((Principal)principal, role)) {
                    return true;
                } else if (p != principal
                           && role.equals(principal.getName())) {
                    return true;
                }
            }
        }
        return false;
    }
