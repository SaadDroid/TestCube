@Override
  public boolean canHandle( File file ) {
    if ( !file.exists() ) {
      return false;
    }

    if ( this.isTarGzFile( file ) ) {
      return canHandleTarGzFile( file );
    } else if ( this.isZipFile( file ) ) {
      return canHandleZipFile( file );
    }

    return false;
  }
