public void removeRelationForResource(ForeignableOwner deletingOwner, Integer resourceId) throws ForeignableOwnerViolationException {
        ResourceEntity cpiResource = entityManager.find(ResourceEntity.class, resourceId);
        permissionService.checkPermissionAndFireException(Permission.RESOURCE, null, Action.UPDATE, cpiResource.getResourceGroup(), null, null);

        if (cpiResource != null) {
            SoftlinkRelationEntity softlinkRelation = cpiResource.getSoftlinkRelation();
            if (softlinkRelation != null){
                foreignableService.verifyDeletableByOwner(deletingOwner, softlinkRelation);

                softlinkRelationService.removeSoftlinkRelation(cpiResource);
            }

        } else {
            throw new RuntimeException("No resource found for id "+ resourceId);
        }
    }
