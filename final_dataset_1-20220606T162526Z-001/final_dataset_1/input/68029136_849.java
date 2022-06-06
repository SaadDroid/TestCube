void extractNodes(EnvironmentGenerationResult environmentResult) {
		if (environmentResult != null && environmentResult.getNodeGenerationResults() != null) {
			for (NodeGenerationResult result : environmentResult.getNodeGenerationResults()) {
				if (!nodes.contains(result.getNode())) {
					nodes.add(result.getNode());
				}
				Map<ResourceGroupEntity, List<ComparedGeneratedTemplates>> appTemplates = applicationGeneratedResults
						.get(result.getNode());
				if (appTemplates == null) {
					appTemplates = new HashMap<ResourceGroupEntity, List<ComparedGeneratedTemplates>>();
					applicationGeneratedResults.put(result.getNode(), appTemplates);
					for (ApplicationGenerationResult appResult : result.getApplicationResults()) {
						appTemplates.put(appResult.getApplication().getResourceGroup(), null);
					}
				}

			}
		}
	}
