public void storeIdInThreadLocalForAuditLog(HasContexts<?> hasContexts) {
        if (hasContexts instanceof ResourceTypeEntity) {
            setResourceTypeIdInThreadLocal(hasContexts.getId());
        } else if (hasContexts instanceof ResourceEntity) {
            setResourceIdInThreadLocal(hasContexts.getId());
        } else if (hasContexts instanceof ConsumedResourceRelationEntity) {
            setResourceIdInThreadLocal(((ConsumedResourceRelationEntity) hasContexts).getMasterResourceId());
        } else if (hasContexts instanceof ProvidedResourceRelationEntity) {
            setResourceIdInThreadLocal(((ProvidedResourceRelationEntity) hasContexts).getMasterResource().getId());
        } else if (hasContexts instanceof ResourceRelationTypeEntity) {
            setResourceTypeIdInThreadLocal(((ResourceRelationTypeEntity) hasContexts).getResourceTypeA().getId());
        }
    }
