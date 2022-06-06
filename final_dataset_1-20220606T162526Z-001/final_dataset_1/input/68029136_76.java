public String getOriginOfValue(Integer contextId, String relationIdentifier) {
        if (!isDefinedInContext(contextId)) {
            if (getTypeName() != null) {
                return getResourceDescriptionForContextOwner(getTypeName(), relationIdentifier) + " ("
                        + getTypeContName() + ")";
            }
            else if (getPropContName() != null) {
                return getResourceDescriptionForContextOwner(null, relationIdentifier) + " ("
                        + getPropContName() + ")";
            }
        }
        else if (getReplacedValue() != null) {
            if (parent.getTypeName() != null) {
                return getResourceDescriptionForContextOwner(parent.getTypeName(), relationIdentifier)
                        + " (" + parent.getTypeContName() + ")";
            }
            else {
                return getResourceDescriptionForContextOwner(null, relationIdentifier) + " ("
                        + parent.getPropContName() + ")";
            }
        }
        return null;
    }
