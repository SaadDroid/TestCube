public T getItem( String key ) {
    if ( key == null ) {
      return null;
    }
    synchronized ( map ) {
      return map.get( key ) != null ? map.get( key ).getItem() : null;
    }
  }
