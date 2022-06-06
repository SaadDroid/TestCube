@Override
	public SoftlinkRelationEntity getCopy(SoftlinkRelationEntity target, CopyUnit copyUnit) {
		if (target == null) {
			target = new SoftlinkRelationEntity();
		}
        // only set softlink rel on target if not in Predecessor mode
        if(!CopyResourceDomainService.CopyMode.MAIA_PREDECESSOR.equals(copyUnit.getMode())){
            target.setSoftlinkRef(this.softlinkRef);
        }
		target.setCpiResource(copyUnit.getTargetResource());
		CopyHelper.copyForeignable(target, this, copyUnit);

		return target;
	}
