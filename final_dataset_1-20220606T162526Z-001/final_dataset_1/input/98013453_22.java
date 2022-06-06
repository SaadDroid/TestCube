@Override
    public boolean isValidValue(Object obj) {
        if (obj != null) {
            for (AtlasEntityType superType : superTypes) {
                if (!superType.isValidValue(obj)) {
                    return false;
                }
            }

            return super.isValidValue(obj) && validateRelationshipAttributes(obj);
        }

        return true;
    }
