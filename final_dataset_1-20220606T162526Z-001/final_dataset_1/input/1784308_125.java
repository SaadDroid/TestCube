@Override
    protected void applyTo(Page page, Violations violations) {
        for (HtmlDefinitionList definitionList : page.findAllDefinitionLists()) {
            if (!containsDefinitionTermsOrDescription(definitionList)) {
                violations.add(createViolation(definitionList, page, RULE_MESSAGE));
            }
        }
    }
