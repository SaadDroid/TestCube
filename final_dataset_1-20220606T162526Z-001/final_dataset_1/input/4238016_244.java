@RequestMapping(value="/{projectName:" + DocumentrConstants.PROJECT_NAME_PATTERN + "}/" +
			"{branchName:" + DocumentrConstants.BRANCH_NAME_PATTERN + "}/" +
			"{path:" + DocumentrConstants.PAGE_PATH_URL_PATTERN + "}",
			method={ RequestMethod.GET, RequestMethod.HEAD })
	@PreAuthorize("hasPagePermission(#projectName, #branchName, #path, VIEW)")
	public String getPage(@PathVariable String projectName, @PathVariable String branchName,
			@PathVariable String path, Model model, HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		try {
			path = Util.toRealPagePath(path);
			PageMetadata metadata = pageStore.getPageMetadata(projectName, branchName, path);

			long lastEdited = metadata.getLastEdited().getTime();
			long authenticationCreated = AuthenticationUtil.getAuthenticationCreationTime(request.getSession());
			long projectEditTime = PageUtil.getProjectEditTime(projectName);
			long lastModified = Math.max(lastEdited, authenticationCreated);
			if (projectEditTime >= 0) {
				lastModified = Math.max(lastModified, projectEditTime);
			}

			long modifiedSince = request.getDateHeader("If-Modified-Since"); //$NON-NLS-1$
			if ((modifiedSince >= 0) && (lastModified <= modifiedSince)) {
				return ErrorController.notModified();
			}

			response.setDateHeader("Last-Modified", lastModified); //$NON-NLS-1$
			response.setDateHeader("Expires", 0); //$NON-NLS-1$
			response.setHeader("Cache-Control", "must-revalidate, private"); //$NON-NLS-1$ //$NON-NLS-2$

			Page page = pageStore.getPage(projectName, branchName, path, false);
			model.addAttribute("path", path); //$NON-NLS-1$
			model.addAttribute("pageName", //$NON-NLS-1$
					path.contains("/") ? StringUtils.substringAfterLast(path, "/") : path); //$NON-NLS-1$ //$NON-NLS-2$
			model.addAttribute("parentPagePath", page.getParentPagePath()); //$NON-NLS-1$
			model.addAttribute("title", page.getTitle()); //$NON-NLS-1$
			String viewRestrictionRole = page.getViewRestrictionRole();
			model.addAttribute("viewRestrictionRole", //$NON-NLS-1$
					(viewRestrictionRole != null) ? viewRestrictionRole : StringUtils.EMPTY);
			model.addAttribute("commit", metadata.getCommit()); //$NON-NLS-1$
			return "/project/branch/page/view"; //$NON-NLS-1$
		} catch (PageNotFoundException e) {
			return ErrorController.notFound("page.notFound"); //$NON-NLS-1$
		}
	}
