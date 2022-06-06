@VisibleForTesting
  String getToString( String key, T item ) {
    return new MapItem<T>( key, item ).toString();
  }
