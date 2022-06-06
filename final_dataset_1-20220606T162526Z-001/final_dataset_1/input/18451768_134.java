@Override public boolean isConnected() {
    return getGeofencingImpl().isConnected() && getSettingsApiImpl().isConnected()
        && getFusedLocationProviderApiImpl().isConnected() && clientManager.containsClient(this);
  }
