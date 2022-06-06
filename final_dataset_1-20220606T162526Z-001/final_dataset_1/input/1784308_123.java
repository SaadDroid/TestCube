@Override
    protected void applyTo(Page page, Violations violations) {
        List<HtmlOrderedList> orderedLists = page.findAllOrderedLists();
        for (HtmlOrderedList orderedList : orderedLists) {
            if (!listHasOneOrMoreListItems(orderedList)) {
                violations.add(createViolation(orderedList, page, RULE_MESSAGE));
            }
        }
    }
