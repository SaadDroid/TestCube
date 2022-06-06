public static int getMaxSize( String query ) {
    if ( query != null ) {
      Matcher matcher = maxSizePattern.matcher( query );
      if ( matcher.matches() ) {
        return Integer.parseInt( matcher.group( 1 ) );
      }
    }
    return TEN_MEGABYTES;
  }
