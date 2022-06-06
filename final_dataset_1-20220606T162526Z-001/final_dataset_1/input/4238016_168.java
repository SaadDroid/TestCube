public HttpServletRequest create(HttpServletRequest request) {
		String documentrHost = systemSettingsStore.getSetting(SystemSettingsStore.DOCUMENTR_HOST);
		return new FacadeHostRequestWrapper(request, documentrHost);
	}
