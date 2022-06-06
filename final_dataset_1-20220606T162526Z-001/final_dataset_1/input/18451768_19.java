@Override public void addListener(LostApiClient client, LocationRequest request,
      LocationListener listener) {
    throwIfClientNotAdded(client);
    clients.get(client).locationListeners().add(listener);
    listenerToReports.put(listener, new LocationRequestReport(request));
  }
