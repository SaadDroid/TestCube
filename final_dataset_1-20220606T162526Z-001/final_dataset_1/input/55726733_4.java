@Override
	public void execute() throws Exception {
		BladeCLI bladeCLI = getBladeCLI();

		CreateArgs createArgs = getArgs();

		File dir = createArgs.getDir();

		if (dir == null) {
			dir = createArgs.getBase();
		}

		WorkspaceProvider workspaceProvider = bladeCLI.getWorkspaceProvider(dir);

		if ((workspaceProvider == null) || (workspaceProvider instanceof MavenWorkspaceProvider)) {
			createArgs.setProduct("portal");
			createArgs.setProfileName("maven");

			super.execute();
		}
		else {
			bladeCLI.error("Cannot create maven project here, incompatible workspace profile type.");
		}
	}
