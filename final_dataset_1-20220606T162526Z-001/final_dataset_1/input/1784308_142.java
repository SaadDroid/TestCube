@Override
    protected void applyTo(Page page, Violations violations) {
        for (HtmlTable table : page.findAllTableTags()) {
            if (table.getCaptionText() == null || table.getCaptionText().isEmpty()) {
                violations.add(createViolation(table, page, RULE_MESSAGE));
            }
        }
    }
