@RequestMapping(value="/save", method=RequestMethod.POST)
	@PreAuthorize("hasApplicationPermission(ADMIN)")
	public String saveRole(@ModelAttribute @Valid RoleForm form, BindingResult bindingResult,
			Authentication authentication) throws IOException {

		if (StringUtils.isNotBlank(form.getName()) &&
			(StringUtils.isBlank(form.getOriginalName()) ||
					!form.getName().equals(form.getOriginalName()))) {

			try {
				if (userStore.getRole(form.getName()) != null) {
					bindingResult.rejectValue("name", "role.name.exists"); //$NON-NLS-1$ //$NON-NLS-2$
				}
			} catch (RoleNotFoundException e) {
				// okay
			}
		}

		if (bindingResult.hasErrors()) {
			return "/user/role/edit"; //$NON-NLS-1$
		}

		EnumSet<Permission> permissions = EnumSet.noneOf(Permission.class);
		for (String permission : form.getPermissions()) {
			permissions.add(Permission.valueOf(permission));
		}
		String newRoleName = form.getOriginalName();
		if (StringUtils.isBlank(newRoleName)) {
			newRoleName = form.getName();
		}
		Role role = new Role(newRoleName, permissions);
		User user = userStore.getUser(authentication.getName());
		userStore.saveRole(role, user);

		if (StringUtils.isNotBlank(form.getOriginalName()) && StringUtils.isNotBlank(form.getName()) &&
				!StringUtils.equals(form.getName(), form.getOriginalName())) {

			userStore.renameRole(form.getOriginalName(), form.getName(), user);
		}

		return "redirect:/roles"; //$NON-NLS-1$
	}
