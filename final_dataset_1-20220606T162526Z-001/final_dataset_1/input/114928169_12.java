public String getStateBuildStartedAsChecked() {
		if (states.enabled(BUILD_STARTED)){
			return "checked ";
		}
		return ""; 
	}
