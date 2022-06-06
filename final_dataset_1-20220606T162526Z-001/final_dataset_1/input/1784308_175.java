@Override
    protected void applyTo(Page page, Violations violations) {
        List<HtmlTitle> allTitleTags = page.findAllTitleTags();
        if (allTitleTags.isEmpty()) {
            violations.add(createViolation(null, page, RULE_MESSAGE));
        } else if (allTitleTags.size() > 1) {
            for (HtmlTitle title : allTitleTags) {
                violations.add(createViolation(title, page, RULE_MESSAGE));
            }
        }
    }
