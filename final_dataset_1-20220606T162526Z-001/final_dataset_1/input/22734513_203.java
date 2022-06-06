public static Matcher getResourceNameMatcher( String path ) {
    Matcher matcher = RESOURCE_NAME_PATTERN.matcher( path );
    boolean matches = matcher.matches();
    if ( matches ) {
      return matcher;
    } else {
      throw new IllegalArgumentException(
        "Path must be of the form prefix/filename[_internationalization].properties[.priority]" );
    }
  }
