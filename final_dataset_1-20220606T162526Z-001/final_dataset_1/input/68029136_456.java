public boolean identicalOrMoreGeneralRestrictionExists(RestrictionEntity newRestriction) {
        if (newRestriction.getRole() != null) {
            return hasSimilarRoleRestriction(newRestriction);
        } else if (newRestriction.getUser() != null) {
            return hasSimilarUserRestriction(newRestriction);
        }
        return false;
    }
