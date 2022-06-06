public void handleIntent(Intent intent) {
    int transition = intentHelper.transitionForIntent(intent);
    int intentId = intentHelper.extractIntentId(intent);
    ParcelableGeofence geofence = (ParcelableGeofence) geofencingApi.geofenceForIntentId(intentId);
    switch (transition) {
      case Geofence.GEOFENCE_TRANSITION_ENTER:
        geofencingApi.geofenceEntered(geofence, intentId);
        break;
      case Geofence.GEOFENCE_TRANSITION_EXIT:
        geofencingApi.geofenceExited(geofence);
      default:
        break;
    }
  }
