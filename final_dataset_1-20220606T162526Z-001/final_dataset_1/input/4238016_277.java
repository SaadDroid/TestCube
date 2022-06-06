@Subscribe
	public void renameProject(ProjectRenamedEvent event) {
		final String projectName = event.getProjectName();
		final String newProjectName = event.getNewProjectName();
		Function<Page, Page> function = new Function<Page, Page>() {
			@Override
			public Page apply(Page page) {
				return page.getProjectName().equals(projectName) ?
						new Page(newProjectName, page.getBranchName(), page.getPath()) :
						page;
			}
		};

		try {
			transformAllSubscriptions(function, "rename project " + projectName + " to " + newProjectName, //$NON-NLS-1$ //$NON-NLS-2$
					event.getCurrentUser());
		} catch (IOException e) {
			log.error(StringUtils.EMPTY, e);
		} catch (GitAPIException e) {
			log.error(StringUtils.EMPTY, e);
		}
	}
