@Override
  public URL getScriptResource( String name ) {
    URL url = null;

    try {
      url = this.resourceRoot.resolve( this.scripts.get( name ) ).toURL();
    } catch ( MalformedURLException ignored ) {
    }

    return url;
  }
