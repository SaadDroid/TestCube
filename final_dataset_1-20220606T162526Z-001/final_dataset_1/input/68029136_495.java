<T extends AbstractResourceRelationEntity> T getMasterRelation(final ResourceEntity relatedResource,
			final Set<T> relations) {
		if (relations != null) {
			for (final T relation : relations) {
				if (relation.getSlaveResource() != null && relation.getSlaveResource().getId() != null) {
					if (relation.getSlaveResource().getId().equals(relatedResource.getId())) {
						return relation;
					}
				}
			}
		}
		return null;
	}
