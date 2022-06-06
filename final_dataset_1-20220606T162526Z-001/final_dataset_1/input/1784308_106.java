@Override
    protected void applyTo(Page page, Violations violations) {
        for (HtmlLabel label : page.findAllLabelTags()) {
            validateLabel(label, page, violations);
        }
    }
