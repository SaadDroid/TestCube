public AmwFunctionEntity overwriteResourceTypeFunction(String functionBody, AmwFunctionEntity functionToOverwrite, ResourceTypeEntity resourceType) {
        if (resourceType.isRootResourceType() || isAlreadyOverwrittenInResourceType(functionToOverwrite, resourceType)){
            throw new RuntimeException("Can not overwrite resource type function!");
        }
        AmwFunctionEntity overwritingFunction = null;
        if (functionToOverwrite.isOverwrittenBySubTypeOrResourceFunction()) {
			for (AmwFunctionEntity oldOverwritingFunction : functionToOverwrite.getOverwritingChildFunction()) {
				if (isOverwrittenInSubTypeOrResource(resourceType, oldOverwritingFunction) && hasSameParentResourceType(resourceType, oldOverwritingFunction)) {
                    overwritingFunction = replaceOverwriting(functionBody, functionToOverwrite, oldOverwritingFunction);
                    break;
				}
			}

		}
        if (overwritingFunction == null) {
            overwritingFunction = overwriteFunction(functionBody, functionToOverwrite);
        }

        overwritingFunction.setResourceType(resourceType);
        return overwritingFunction;
	}
