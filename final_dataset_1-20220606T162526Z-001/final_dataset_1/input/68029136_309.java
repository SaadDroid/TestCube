public boolean isSuccess() {
		if(errorMessages != null && !errorMessages.isEmpty()){
			return false;
		}
		return !hasErrorsInGeneratedTemplates() && !hasErrorsInPreprocessing();
	}
