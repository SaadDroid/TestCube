@RequestMapping(value="/save", method=RequestMethod.POST)
	@PreAuthorize("hasApplicationPermission(ADMIN)")
	public String saveMacro(@ModelAttribute @Valid MacroForm form, BindingResult bindingResult) throws IOException {
		if (bindingResult.hasErrors()) {
			return "/macro/edit"; //$NON-NLS-1$
		}

		macroFactory.saveGroovyMacro(form.getName(), form.getCode());

		return "redirect:/macros"; //$NON-NLS-1$
	}
