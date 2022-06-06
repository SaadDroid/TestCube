void performRetry(BitmapHunter hunter) {
    if (hunter.isCancelled()) return;

    if (service.isShutdown()) {
      performError(hunter, false);
      return;
    }

    NetworkInfo networkInfo = null;
    if (scansNetworkChanges) {
      ConnectivityManager connectivityManager = getService(context, CONNECTIVITY_SERVICE);
      networkInfo = connectivityManager.getActiveNetworkInfo();
    }

    if (hunter.shouldRetry(airplaneMode, networkInfo)) {
      if (hunter.getPicasso().loggingEnabled) {
        log(OWNER_DISPATCHER, VERB_RETRYING, getLogIdsForHunter(hunter));
      }
      if (hunter.getException() instanceof NetworkRequestHandler.ContentLengthException) {
        hunter.networkPolicy |= NetworkPolicy.NO_CACHE.index;
      }
      hunter.future = service.submit(hunter);
    } else {
      // Mark for replay only if we observe network info changes and support replay.
      boolean willReplay = scansNetworkChanges && hunter.supportsReplay();
      performError(hunter, willReplay);
      if (willReplay) {
        markForReplay(hunter);
      }
    }
  }
