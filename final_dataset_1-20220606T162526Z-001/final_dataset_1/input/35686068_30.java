@Override
	public Page<UserActivityDTO> getPublicActivity(Pageable pageable) {
		Page<Action> actions = actionRepository.findAll(pageable);
		List<UserActivityDTO> result = transform(actions);
		return new PageImpl<>(result, pageable, actions.getTotalElements());
	}
