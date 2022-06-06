@Override public URLConnection openConnection( URL u ) throws IOException {
    URL fileUrl = new URL( "file", null, u.getPath() );
    return new PlatformPluginBundlingURLConnection( fileUrl, pluginFileHandlers );
  }
