@RequestMapping(method=RequestMethod.GET)
	@PreAuthorize("hasApplicationPermission(ADMIN)")
	public String getUsers() {
		return "/user/index"; //$NON-NLS-1$
	}
