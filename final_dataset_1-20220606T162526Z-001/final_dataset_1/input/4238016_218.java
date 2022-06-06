@RequestMapping(value="/save/{projectName:" + DocumentrConstants.PROJECT_NAME_PATTERN + "}/" +
			"{branchName:" + DocumentrConstants.BRANCH_NAME_PATTERN + "}/" +
			"{pagePath:" + DocumentrConstants.PAGE_PATH_URL_PATTERN + "}",
			method=RequestMethod.POST)
	@PreAuthorize("hasPagePermission(#projectName, #branchName, #pagePath, EDIT_PAGE)")
	public String saveAttachment(@PathVariable String projectName, @PathVariable String branchName,
			@PathVariable String pagePath, @RequestParam MultipartFile file, Authentication authentication)
			throws IOException {

		saveAttachmentInternal(projectName, branchName, pagePath, file, authentication);
		return "redirect:/attachment/list/" + projectName + "/" + branchName + "/" + pagePath; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}
