@Override public boolean equals( Object o ) {
    if ( this == o ) {
      return true;
    }

    if ( o == null || getClass() != o.getClass() ) {
      return false;
    }

    PlatformWebResource that = (PlatformWebResource) o;

    return new EqualsBuilder()
      .append( context, that.context )
      .append( location, that.location )
      .isEquals();
  }
