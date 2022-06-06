public void onItemClick(View view, int i) {
    Activity context = (Activity) view.getContext();
    if (context.isDestroyed()) {
      return;
    }

    MenuItem menuItem = adapter.getItemAtPosition(i);
    String librarySection = menuItem.getSection();
    String activityType = menuItem.getType();

    if (MENU_TYPE_SEARCH.equalsIgnoreCase(activityType)) {
      context.onSearchRequested();
      return;
    }

    if (MENU_TYPE_OPTIONS.equalsIgnoreCase(activityType)) {
      context.openOptionsMenu();
      return;
    }

    Intent intent;

    if (MENU_TYPE_MOVIE.equalsIgnoreCase(activityType) || MENU_TYPE_MOVIES.equalsIgnoreCase(activityType)) {
      intent = new Intent(context, MovieBrowserActivity.class);
      intent.putExtra("key", librarySection);
      context.startActivityForResult(intent, 0);
      return;
    }

    if (MENU_TYPE_SHOW.equalsIgnoreCase(activityType) || MENU_TYPE_TVSHOWS.equalsIgnoreCase(activityType)) {
      intent = new Intent(context, TVShowBrowserActivity.class);
      intent.putExtra("key", librarySection);
      context.startActivityForResult(intent, 0);
      return;
    }

    if (MENU_TYPE_MUSIC.equalsIgnoreCase(activityType)) {
      Toast.makeText(context, "Music support has been removed.", Toast.LENGTH_LONG);
      return;
    }

    intent = new Intent(context, LeanbackSettingsActivity.class);
    intent.putExtra("key", librarySection);
    context.startActivityForResult(intent, 0);
  }
