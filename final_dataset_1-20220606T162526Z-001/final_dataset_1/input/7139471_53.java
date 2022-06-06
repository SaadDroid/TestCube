@Override
  public void onItemSelected(AdapterView<?> viewAdapter, View view, int position, long id) {

    setMultiViewVideoActivity(activity);

    findViews();

    SecondaryCategoryInfo item = (SecondaryCategoryInfo) viewAdapter.getItemAtPosition(position);

    if (isFirstSelection()) {
      if (categoryState.getGenreCategory() != null) {
        int savedInstancePosition = getSavedInstancePosition(viewAdapter);
        item = (SecondaryCategoryInfo) viewAdapter.getItemAtPosition(savedInstancePosition);
        viewAdapter.setSelection(savedInstancePosition);
      }
      setFirstSelection(false);
    }

    if (selected.equalsIgnoreCase(item.getCategory())) {
      return;
    }

    selected = item.getCategory();

    categoryState.setGenreCategory(item.getCategory());

    Activity activity = getActivity(getMultiViewVideoActivity());
    if (activity instanceof MovieBrowserActivity) {
      MovieBrowserActivity movieBrowserActivity = (MovieBrowserActivity) activity;
      movieBrowserActivity.requestUpdatedVideos(key,
          item.getParentCategory() + "/" + item.getCategory());
    }
  }
