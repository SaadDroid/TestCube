@RequestMapping(value="/generateName/{projectName:" + DocumentrConstants.PROJECT_NAME_PATTERN + "}/" +
			"{branchName:" + DocumentrConstants.BRANCH_NAME_PATTERN + "}/" +
			"{parentPagePath:" + DocumentrConstants.PAGE_PATH_URL_PATTERN + "}/json",
			method=RequestMethod.POST, produces="application/json")
	@ResponseBody
	@PreAuthorize("hasBranchPermission(#projectName, #branchName, VIEW)")
	public Map<String, Object> generateName(@PathVariable String projectName, @PathVariable String branchName,
			@PathVariable String parentPagePath, @RequestParam String title) throws IOException {

		String name = Util.simplifyForUrl(title);
		String path = Util.toRealPagePath(parentPagePath) + "/" + name; //$NON-NLS-1$
		boolean pageExists = false;
		try {
			Page page = pageStore.getPage(projectName, branchName, path, false);
			pageExists = page != null;
		} catch (PageNotFoundException e) {
			// okay
		}

		Map<String, Object> result = new HashMap<String, Object>();
		result.put("path", path); //$NON-NLS-1$
		result.put("exists", Boolean.valueOf(pageExists)); //$NON-NLS-1$
		return result;
	}
