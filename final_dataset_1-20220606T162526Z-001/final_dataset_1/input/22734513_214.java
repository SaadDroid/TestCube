public synchronized OSGIResourceBundle getBundle( ResourceBundle parent ) throws IOException {
    if ( previousResult == null || previousParent != parent ) {
      previousParent = parent;
      previousResult = new OSGIResourceBundle( defaultName, parent, propertyFileUrl );
    }
    return previousResult;
  }
