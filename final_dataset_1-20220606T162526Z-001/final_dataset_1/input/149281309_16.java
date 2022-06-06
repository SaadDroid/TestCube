@Override
    public void translateFilter() {

        String searchTest = getQueryRequest().getSearchText();
        if (searchTest != null && !searchTest.isEmpty()) {
            this.searchFilter = searchTest;
            return;
        }
        this.searchFilter = translateFilter(getQueryRequest().getSearchSentence());
    }
