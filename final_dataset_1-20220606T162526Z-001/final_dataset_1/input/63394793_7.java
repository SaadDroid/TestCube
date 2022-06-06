@Override
    public void onConnected(@Nullable Bundle bundle) {
        if (PermissionsActivity.checkPermissions(context)) {
            onLocationPermissionsGranted();
        } else {
            // Spawn permission request activity
            PermissionsActivity.requestPermissions(context, this);
        }
    }
