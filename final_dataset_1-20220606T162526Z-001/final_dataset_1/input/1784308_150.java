@Override
    protected void applyTo(Page page, Violations violations) {
        for (HtmlImage image : page.findAllImageTags()) {
            if (hasAttribute(image, "ismap")) {
                violations.add(createViolation(image, page, RULE_MESSAGE));
            }
        }
    }
