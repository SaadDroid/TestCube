@Override
	public DeviceData process(DeviceData item) throws Exception {
		if (userService.hasAccessToOrgByCode(getServiceContext(), getUserId(), item.getCombinedCode())) {
			log.debug("Granting delete access to org: {}", item.getCombinedCode());
			return item;
		}
		log.debug("Denying delete access to org: {}", item.getCombinedCode());
		List<ValidationError> errors = Lists.newArrayList();
		addNotAllowedError(errors, item.getCombinedCode(), "delete");
		throwIfErrors(errors);
		return null;
	}
