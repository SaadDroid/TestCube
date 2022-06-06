@Override
	public ResourceEntity getCopy(ResourceEntity target, CopyUnit copyUnit) {
		// copy name when releasing
		if(copyUnit.getMode() == CopyResourceDomainService.CopyMode.RELEASE){
			target.setName(this.getName());
			copyUnit.getResult().setTargetResourceName(target.getName());
		}

		// resource type can not be changed! (both resources must be from the same type/subtype!)
		Integer origResTypeId = this.getResourceType() != null ? this.getResourceType().getId() : null;
		Integer targetResTypeId = target.getResourceType() != null ? target.getResourceType().getId() : null;
		if (targetResTypeId != null && !CopyHelper.equalsWithNullCheck(origResTypeId, targetResTypeId)) {
			copyUnit.getResult().addCopyResultError(CopyResourceResult.CopyFailure.RESOURCETYPE_DIFF, CopyResourceResult.CopyTarget.RESOURCE,
					null, target.getResourceType().getName(),
					this.getResourceType().getName());
		}
		if (targetResTypeId == null) {
			target.setResourceType(this.getResourceType());
		}

		// is deletable
		if (target.isDeletable() != this.isDeletable()) {
			copyUnit.getResult().addChangedResourceParam(CopyResourceResult.CopyInfo.DELETABLE_CHANGED);
		}
		target.setDeletable(this.isDeletable());
		// only set softlink rel on target if not in Predecessor mode
		if(!CopyResourceDomainService.CopyMode.MAIA_PREDECESSOR.equals(copyUnit.getMode())){
			target.setSoftlinkId(this.getSoftlinkId());
		}

		CopyHelper.copyForeignable(target, this, copyUnit);
		return target;
	}
