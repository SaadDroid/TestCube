public TunnelInput createInput( ObjectInputStream objectInputStream ) {
    return new TunnelInput( objectInputStream, serializerMap );
  }
