@RequestMapping(value="/login/error", method=RequestMethod.GET)
	@PreAuthorize("permitAll")
	public String loginError(HttpSession session, Model model) {
		AuthenticationException exception =
				(AuthenticationException) session.getAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
		String msg = getMessage(exception);
		if (StringUtils.isNotBlank(msg)) {
			model.addAttribute("errorMessage", msg); //$NON-NLS-1$
		}
		return "/login"; //$NON-NLS-1$
	}
