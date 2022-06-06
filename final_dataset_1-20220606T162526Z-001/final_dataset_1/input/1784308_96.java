@Override
    protected void applyTo(Page page, Violations violations) {
        List<HtmlLabel> labels = page.findAllLabelTags();
        for (HtmlLabel label : labels) {
            if (!exactlyOneLabelWithGivenForAttribute(labels, label.getForAttribute())) {
                violations.add(createViolation(label, page, RULE_MESSAGE));
            }
        }
    }
