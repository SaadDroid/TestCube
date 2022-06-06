public ReleaseEntity getFirstRelease() {
		ReleaseEntity firstRelease = null;
		if (resources != null) {
			for (ResourceEntity resource : resources) {
				if (firstRelease == null || firstRelease.compareTo(resource.getRelease()) > 0) {
					firstRelease = resource.getRelease();
				}
			}
		}
		return firstRelease;
	}
