@Override
  public T_EXTERNAL getCurrentItem() {
    if (currentItem == null) {
      T_INTERNAL internalItem = queryNavigator.getCurrentItem();
      if (internalItem != null) {
        currentItem = converter.toNavigatorItemType(internalItem);
      }
    }
    return currentItem;
  }
