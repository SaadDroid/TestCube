@Override public URL transform( URL artifact ) throws Exception {
    return urlFactory.create( PROTOCOL, artifact.getFile() );
  }
