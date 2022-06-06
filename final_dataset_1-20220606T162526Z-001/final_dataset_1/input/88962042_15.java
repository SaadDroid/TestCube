public void dispatch(EvaluatedRule evaluatedRule) {
        for (ArchUnitExtension extension : extensionLoader.getAll()) {
            dispatch(evaluatedRule, extension);
        }
    }
