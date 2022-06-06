@Override
  public ValueT get() {
    if (isValid()) {
      return myList.get(getIndex().get());
    } else {
      return null;
    }
  }
