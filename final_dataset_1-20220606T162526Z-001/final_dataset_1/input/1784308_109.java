@Override
    protected void applyTo(Page page, Violations violations) {
        for (HtmlUnknownElement applet : page.findAllAppletTags()) {
            if (applet.getTextContent() == null || applet.getTextContent().trim().isEmpty()) {
                violations.add(createViolation(applet, page, RULE_MESSAGE));
            }
        }
    }
