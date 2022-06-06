public void setSerializers( List<TunnelSerializer<?>> serializers ) {
    if ( serializers != null ) {
      this.serializers.addAll( serializers );
    }
    populateSerializerMap();
  }
