@Override
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public boolean delete(Deployment deployment) {
		try {
			deployment = entityManager.getReference(Deployment.class, deployment.getId());
			entityManager.remove(deployment);
			entityManager.flush();
			return true;
		} catch(EntityNotFoundException e) {
			logger.debug(e);
			return false;
		} 
	}
