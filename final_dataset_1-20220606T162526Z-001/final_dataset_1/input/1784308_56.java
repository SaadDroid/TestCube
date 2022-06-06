@Override
    protected void applyTo(Page page, Violations violations) {
        HtmlElement lastHeading = null;
        for (HtmlElement currentHeading : page.findAllHeadingTags()) {
            if (lastHeading == null) {
                checkFirstHeading(violations, currentHeading, page);
            } else {
                checkAllOtherHeadings(violations, lastHeading, currentHeading, page);
            }
            lastHeading = currentHeading;
        }
    }
