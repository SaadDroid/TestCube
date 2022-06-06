@NonNull
    @SuppressWarnings("deprecation")
    public static JobRequest.NetworkType getNetworkType(@NonNull Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo;
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Throwable t) {
            return JobRequest.NetworkType.ANY;
        }

        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            return JobRequest.NetworkType.ANY;
        }

        boolean metered = ConnectivityManagerCompat.isActiveNetworkMetered(connectivityManager);
        if (!metered) {
            return JobRequest.NetworkType.UNMETERED;
        }

        if (isRoaming(connectivityManager, networkInfo)) {
            return JobRequest.NetworkType.CONNECTED;
        } else {
            return JobRequest.NetworkType.NOT_ROAMING;
        }
    }
