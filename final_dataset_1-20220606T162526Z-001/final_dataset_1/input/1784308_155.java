@Override
    protected void applyTo(Page page, Violations violations) {
        for (HtmlImage image : page.findAllImageTags()) {
            validateImage(image, page, violations);
        }
    }
