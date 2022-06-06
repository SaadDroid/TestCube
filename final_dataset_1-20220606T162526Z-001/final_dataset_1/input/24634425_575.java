@Override
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public VM getById(int id) {
		return entityManager.find(VM.class, id);
	}
