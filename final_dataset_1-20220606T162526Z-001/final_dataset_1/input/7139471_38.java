@Subscribe(threadMode = ThreadMode.MAIN) public void onTVCategoryResponse(TVCategoryEvent event) {
    TVCategoryMediaContainer categoryMediaContainer = new TVCategoryMediaContainer(event.getMediaContainer());
    List<CategoryInfo> categories = categoryMediaContainer.createCategories();
    getViewState().updateCategories(categories);
  }
