public boolean projectExists(String projectName) {
		return repoManager.listProjects().contains(StringUtils.defaultString(projectName));
	}
