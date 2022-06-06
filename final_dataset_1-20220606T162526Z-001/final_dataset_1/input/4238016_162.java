@RequestMapping(value="/save", method=RequestMethod.POST)
	@PreAuthorize("hasApplicationPermission(ADMIN)")
	public String saveUser(@ModelAttribute @Valid UserForm form, BindingResult bindingResult,
			Authentication authentication) throws IOException {

		User user = userStore.getUser(authentication.getName());

		if (StringUtils.isNotBlank(form.getOriginalLoginName()) &&
			!form.getOriginalLoginName().equals(UserStore.ANONYMOUS_USER_LOGIN_NAME) &&
			StringUtils.equals(form.getLoginName(), UserStore.ANONYMOUS_USER_LOGIN_NAME)) {

			bindingResult.rejectValue("loginName", "user.loginName.invalid"); //$NON-NLS-1$ //$NON-NLS-2$
			return "/user/edit"; //$NON-NLS-1$
		}

		if (!form.getLoginName().equals(UserStore.ANONYMOUS_USER_LOGIN_NAME)) {
			if (StringUtils.isNotBlank(form.getLoginName()) &&
				(StringUtils.isBlank(form.getOriginalLoginName()) ||
						!form.getLoginName().equals(form.getOriginalLoginName()))) {

				try {
					if (userStore.getUser(form.getLoginName()) != null) {
						bindingResult.rejectValue("loginName", "user.loginName.exists"); //$NON-NLS-1$ //$NON-NLS-2$
					}
				} catch (UserNotFoundException e) {
					// okay
				}
			}

			if (StringUtils.isBlank(form.getOriginalLoginName()) &&
				StringUtils.isBlank(form.getPassword1())) {

				bindingResult.rejectValue("password1", "user.password.blank"); //$NON-NLS-1$ //$NON-NLS-2$
			}

			if (StringUtils.isBlank(form.getOriginalLoginName()) &&
					StringUtils.isBlank(form.getPassword2())) {

				bindingResult.rejectValue("password2", "user.password.blank"); //$NON-NLS-1$ //$NON-NLS-2$
			}

			if (StringUtils.isBlank(form.getPassword1()) && StringUtils.isNotBlank(form.getPassword2())) {
				bindingResult.rejectValue("password1", "user.password.blank"); //$NON-NLS-1$ //$NON-NLS-2$
			}

			if (StringUtils.isNotBlank(form.getPassword1()) && StringUtils.isBlank(form.getPassword2())) {
				bindingResult.rejectValue("password2", "user.password.blank"); //$NON-NLS-1$ //$NON-NLS-2$
			}

			if (StringUtils.isNotBlank(form.getPassword1()) &&
				StringUtils.isNotBlank(form.getPassword2()) &&
				!StringUtils.equals(form.getPassword1(), form.getPassword2())) {

				bindingResult.rejectValue("password1", "user.password.passwordsNotEqual"); //$NON-NLS-1$ //$NON-NLS-2$
				bindingResult.rejectValue("password2", "user.password.passwordsNotEqual"); //$NON-NLS-1$ //$NON-NLS-2$
			}

			if (bindingResult.hasErrors()) {
				return "/user/edit"; //$NON-NLS-1$
			}

			User existingUser = null;
			String password = null;
			if (StringUtils.isNotBlank(form.getOriginalLoginName())) {
				try {
					existingUser = userStore.getUser(form.getOriginalLoginName());
					password = existingUser.getPassword();
				} catch (UserNotFoundException e) {
					// okay
				}
			}

			if (StringUtils.isNotBlank(form.getPassword1())) {
				password = passwordEncoder.encode(form.getPassword1());
			}

			if (StringUtils.isBlank(password)) {
				bindingResult.rejectValue("password1", "user.password.blank"); //$NON-NLS-1$ //$NON-NLS-2$
				bindingResult.rejectValue("password2", "user.password.blank"); //$NON-NLS-1$ //$NON-NLS-2$
			}

			if (bindingResult.hasErrors()) {
				return "/user/edit"; //$NON-NLS-1$
			}

			String newUserName = form.getOriginalLoginName();
			if (StringUtils.isBlank(newUserName)) {
				newUserName = form.getLoginName();
			}

			User newUser = new User(newUserName, password, form.getEmail(), form.isDisabled());
			if (existingUser != null) {
				for (OpenId openId : existingUser.getOpenIds()) {
					newUser.addOpenId(openId);
				}
			}
			userStore.saveUser(newUser, user);

			if (StringUtils.isNotBlank(form.getOriginalLoginName()) &&
				!StringUtils.equals(form.getLoginName(), form.getOriginalLoginName())) {

				userStore.renameUser(form.getOriginalLoginName(), form.getLoginName(), user);
			}
		}

		String[] authorityStrs = StringUtils.defaultString(form.getAuthorities()).split("\\|"); //$NON-NLS-1$
		Set<RoleGrantedAuthority> authorities = Sets.newHashSet();
		for (String authorityStr : authorityStrs) {
			if (StringUtils.isNotBlank(authorityStr)) {
				String[] parts = authorityStr.split(":"); //$NON-NLS-1$
				Assert.isTrue(parts.length == 3);
				Type type = Type.valueOf(parts[0]);
				String targetId = parts[1];
				String roleName = parts[2];
				authorities.add(new RoleGrantedAuthority(new GrantedAuthorityTarget(targetId, type), roleName));
			}
		}
		userStore.saveUserAuthorities(form.getLoginName(), authorities, user);

		return "redirect:/users"; //$NON-NLS-1$
	}
