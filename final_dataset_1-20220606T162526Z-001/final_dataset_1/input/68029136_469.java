public boolean callerHasIdenticalOrMoreGeneralRestriction(RestrictionEntity newRestriction) {
        List<RestrictionEntity> similarRestrictions = new ArrayList<>();
        for (RestrictionEntity restriction : getAllCallerRestrictions()) {
            if (restriction.getPermission().getValue().equals(newRestriction.getPermission().getValue())) {
                checkSimilarRestrictions(newRestriction.getPermission().getValue(), newRestriction.getAction(), newRestriction.getContext(), newRestriction.getResourceGroup(), newRestriction.getResourceType(), similarRestrictions, restriction);
            }
        }
        return aMoreGeneralRestrictionExists(newRestriction, similarRestrictions);
    }
