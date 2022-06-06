@RequestMapping(value="/save", method=RequestMethod.POST)
	@PreAuthorize("projectExists(#form.name) ? " +
			"hasProjectPermission(#form.name, EDIT_PROJECT) : " +
			"hasApplicationPermission(EDIT_PROJECT)")
	public String saveProject(@ModelAttribute @Valid ProjectForm form, BindingResult bindingResult,
			Authentication authentication) throws IOException, GitAPIException {

		String name = form.getName();
		String originalName = form.getOriginalName();
		List<String> projects = globalRepositoryManager.listProjects();
		if (StringUtils.isNotBlank(originalName)) {
			if (!projects.contains(originalName)) {
				bindingResult.rejectValue("originalName", "project.name.nonexistent"); //$NON-NLS-1$ //$NON-NLS-2$
			}
			if (!StringUtils.equals(name, originalName) &&
				projects.contains(name)) {

				bindingResult.rejectValue("name", "project.name.exists"); //$NON-NLS-1$ //$NON-NLS-2$
			}
		} else {
			if (projects.contains(name)) {
				bindingResult.rejectValue("name", "project.name.exists"); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}

		if (bindingResult.hasErrors()) {
			return "/project/edit"; //$NON-NLS-1$
		}

		User user = userStore.getUser(authentication.getName());

		if (StringUtils.isNotBlank(originalName) &&
			!StringUtils.equals(name, originalName)) {

			globalRepositoryManager.renameProject(originalName, name, user);
		} else if (StringUtils.isBlank(originalName)) {
			ILockedRepository repo = null;
			try {
				repo = globalRepositoryManager.createProjectCentralRepository(name, user);
			} finally {
				Util.closeQuietly(repo);
			}
		}
		return "redirect:/project/" + name; //$NON-NLS-1$
	}
