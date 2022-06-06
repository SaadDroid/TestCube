public boolean isDefinedInContext(Integer contextId) {
        if (definedOnSuperResourceType) {
            return false;
        }
        switch (loadedFor) {
        case INSTANCE:
        case RELATION:
            return this.propContextId != null && this.propContextId.equals(contextId)
                    && origin == loadedFor;
        case TYPE:
        case TYPE_REL:
            return this.typeContextId != null && this.typeContextId.equals(contextId)
                    && origin == loadedFor;

        }
        return false;
    }
