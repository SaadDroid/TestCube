public boolean hasErrors() {
		for (GenerationUnitGenerationResult result : generationResults) {
			if(!result.isSuccess()){
				return true;
			}
		}
		return false;
	}
