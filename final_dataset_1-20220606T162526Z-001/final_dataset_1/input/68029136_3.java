public void setResourceActivation(ResourceRelationContextEntity currentResourceRelationContext, ResourceGroupEntity resourceGroup, ResourceActivationEntity existingResourceActivation, Boolean active) {
		//TODO cleanup active resource activation without "inactive" in between over the whole context hierarchy.
	    	boolean alreadyDefinedOnCurrentContext;
		ResourceRelationContextEntity resourceRelationContextEntity;
		if (existingResourceActivation != null
				&& existingResourceActivation.getResourceRelationContext().getContext().getId()
						.equals(currentResourceRelationContext.getContext().getId())) {
			alreadyDefinedOnCurrentContext = true;
		}
		else {
			alreadyDefinedOnCurrentContext = false;
		}
		if (alreadyDefinedOnCurrentContext) {
			// If active is set to null, this means a reset
			if (active == null) {
				entityManager.remove(existingResourceActivation);
			}
			else {
				// We only need to persist it if the value has changed...
				if (existingResourceActivation.isActive() != active.booleanValue()) {
					// If it is the only resource activation in the context hierarchy for this resource
					// relation and shall be active, we remove it - since active is default and we want
					// to prevent the persistence of unnecessary data.
					if (active.booleanValue()
							&& existingResourceActivation.isOnlyActivationEntityForResourceRelation()) {
						entityManager.remove(existingResourceActivation);
					}
					else {
						// activation entity for this relation.
						existingResourceActivation.setActive(active.booleanValue());
						entityManager.persist(existingResourceActivation);
					}
				}
			}
		}
		// If it is the first resource activation in the context hierarchy and shall be active, we don't
		// want to add it - since active is default and we want to prevent the persistence of unnecessary
		// data.
		else if (active != null && (!active.booleanValue() || existingResourceActivation != null)) {
			ResourceActivationEntity entity = new ResourceActivationEntity();
			entity.setResourceGroup(resourceGroup);
			entity.setResourceRelationContext(currentResourceRelationContext);
			entity.setActive(active.booleanValue());
			entityManager.persist(entity);
		}
	}
