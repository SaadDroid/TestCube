public Map<String, Object> merge( Map<String, ?> object1, Map<String, ?> object2 ) {
    Set<String> keys = new HashSet<>( object1.keySet().size() );
    keys.addAll( object1.keySet() );
    keys.addAll( object2.keySet() );

    Map<String, Object> result = new HashMap<>();
    for ( String key : keys ) {
      Object value1 = object1.get( key );
      Object value2 = object2.get( key );

      result.put( key, merge( key, value1, value2 ) );
    }

    return result;
  }
