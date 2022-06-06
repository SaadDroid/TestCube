@Override
    protected void applyTo(Page page, Violations violations) {
        for (HtmlTextArea textarea : page.findAllTextareaTags()) {
            if (hasNonEmptyAttribute(textarea, "id") && !containsLabelForId(page.findAllLabelTags(), textarea.getId())) {
                violations.add(createViolation(textarea, page, RULE_MESSAGE));
            }
        }
    }
