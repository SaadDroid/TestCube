public ResourceEntity getSoftlinkResolvableSlaveResource(SoftlinkRelationEntity softlinkRelation, ReleaseEntity release){
        if (softlinkRelation != null){
            return softlinkRelationService.getSoftlinkResolvableSlaveResource(softlinkRelation.getSoftlinkRef(), release);
        }
        return null;
    }
