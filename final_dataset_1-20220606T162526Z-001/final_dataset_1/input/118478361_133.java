@Override
    public List<String> validate(DMNModelRepository dmnModelRepository) {
        List<String> errors = new ArrayList<>();

        if (dmnModelRepository == null) {
            throw new IllegalArgumentException("Missing definitions");
        }

        for (TDefinitions definitions: dmnModelRepository.getAllDefinitions()) {
            logger.debug("Validate unique 'DRGElement.id'");
            validateUnique(
                    "DRGElement", "id", false, dmnModelRepository,
                    new ArrayList<>(dmnModelRepository.findDRGElements(definitions)), TDMNElement::getId, null, errors
            );

            logger.debug("Validate unique 'DRGElement.name'");
            validateUnique(
                    "DRGElement", "name", false, dmnModelRepository,
                    new ArrayList<>(dmnModelRepository.findDRGElements(definitions)), e -> ((TNamedElement)e).getName(), null, errors
            );

            logger.debug("Validate unique 'ItemDefinition.name'");
            validateUnique(
                    "ItemDefinition", "name", false, dmnModelRepository,
                    new ArrayList<>(dmnModelRepository.findItemDefinitions(definitions)), e -> ((TNamedElement)e).getName(), null, errors
            );

            for (TDRGElement element : dmnModelRepository.findDRGElements(definitions)) {
                logger.debug(String.format("Validate element '%s'", element.getName()));
                if (element instanceof TInputData) {
                    validateInputData((TInputData) element, errors);
                } else if (element instanceof TBusinessKnowledgeModel) {
                    validateBusinessKnowledgeModel((TBusinessKnowledgeModel) element, errors);
                } else if (element instanceof TDecision) {
                    validateDecision((TDecision) element, dmnModelRepository, errors);
                }
            }
        }

        return errors;
    }
