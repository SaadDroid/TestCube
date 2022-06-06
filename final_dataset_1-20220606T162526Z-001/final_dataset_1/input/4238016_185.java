@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		int hashCode = getHashCode(authentication);

		HttpSession session = ((HttpServletRequest) request).getSession();
		Integer lastAuthenticationHashCode = (Integer) session.getAttribute(AUTHENTICATION_HASH_CODE);
		if ((lastAuthenticationHashCode == null) || (lastAuthenticationHashCode != hashCode)) {
			session.setAttribute(AUTHENTICATION_HASH_CODE, hashCode);
			AuthenticationUtil.setAuthenticationCreationTime(session, System.currentTimeMillis());
		}

		chain.doFilter(request, response);
	}
