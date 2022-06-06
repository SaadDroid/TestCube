@RequestMapping(value="/create", method=RequestMethod.GET)
	@PreAuthorize("hasApplicationPermission(EDIT_PROJECT)")
	public String createProject(Model model) {
		ProjectForm form = new ProjectForm(null, null);
		model.addAttribute("projectForm", form); //$NON-NLS-1$
		return "/project/edit"; //$NON-NLS-1$
	}
