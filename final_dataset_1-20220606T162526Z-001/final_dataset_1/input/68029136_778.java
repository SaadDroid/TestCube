public AmwFunctionEntity overwriteResourceFunction(String functionBody, AmwFunctionEntity functionToOverwrite, ResourceEntity resource) {
        AmwFunctionEntity overwritingFunction = overwriteFunction(functionBody, functionToOverwrite);
        overwritingFunction.setResource(resource);
        return overwritingFunction;
    }
