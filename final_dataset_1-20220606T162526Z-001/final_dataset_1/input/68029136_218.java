public String getErrorMessageAsString() {
		StringBuilder sb = new StringBuilder();
		if(generationResults != null && !generationResults.isEmpty() && hasErrors()){
			sb.append("Application Template Errors\n");
			for (GenerationUnitGenerationResult result : generationResults) {
				if(!result.isSuccess()){
					sb.append(result.getErrorMessageAsString());
				}
			}
		}
		return sb.toString();
	}
