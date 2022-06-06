public void removeConstructionHeuristic(final ConstructionHeuristicForm constructionHeuristicForm) {
        phaseFormList.remove(constructionHeuristicForm);
        view.removeConstructionHeuristic(constructionHeuristicForm.getElement());
        model.remove(constructionHeuristicForm.getModel());
        constructionHeuristicFormProvider.destroy(constructionHeuristicForm);
        if (phaseFormList.isEmpty()) {
            view.displayEmptyPhaseConfigurationLabel(true);
        }
    }
