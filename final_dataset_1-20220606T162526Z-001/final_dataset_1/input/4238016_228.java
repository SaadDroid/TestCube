public static String getPageHeaderHtml(String projectName, String branchName, String path) throws IOException {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Locale locale = LocaleContextHolder.getLocale();
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		String contextPath = request.getContextPath();
		String html = pageRenderer.getHeaderHtml(projectName, branchName, path, authentication, locale, contextPath);
		return markdownProcessor.processNonCacheableMacros(html, projectName, branchName, path, authentication, locale,
				contextPath);
	}
