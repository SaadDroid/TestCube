@Override
  public void populateSecondaryCategories(List<SecondaryCategoryInfo> categories,
      String selectedSecondaryCategory) {
    categorySpinner.setVisibility(VISIBLE);
    if (categories == null || categories.isEmpty()) {
      Toast.makeText(this, R.string.no_entries_available_for_category_, Toast.LENGTH_LONG).show();
      return;
    }

    secondarySpinner.setVisibility(VISIBLE);

    ArrayAdapter<SecondaryCategoryInfo> spinnerSecArrayAdapter =
        new ArrayAdapter<SecondaryCategoryInfo>(this, R.layout.serenity_spinner_textview,
            categories);
    spinnerSecArrayAdapter.setDropDownViewResource(R.layout.serenity_spinner_textview_dropdown);
    secondarySpinner.setAdapter(spinnerSecArrayAdapter);
    secondarySpinner.setOnItemSelectedListener(
        new TVSecondaryCategorySpinnerOnItemSelectedListener(selectedSecondaryCategory, key));
    secondarySpinner.requestFocusFromTouch();
  }
