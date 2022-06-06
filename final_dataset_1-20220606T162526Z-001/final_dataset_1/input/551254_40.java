@Override
	public List<IBPELProcess> getBPELProcesses() throws DeploymentException {
		extractBPRIfNecessary();
		return new ArrayList<IBPELProcess>(allProcesses);
	}
