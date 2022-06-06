private void filter(@AlgoliaPopularClient.Range String range) {
        setRange(range);
        Preferences.setPopularRange(this, range);
        ListFragment listFragment = (ListFragment) getSupportFragmentManager()
                .findFragmentByTag(LIST_FRAGMENT_TAG);
        if (listFragment != null) {
            listFragment.filter(range);
        }
    }
