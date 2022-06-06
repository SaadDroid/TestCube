public ExternalPlayer createExternalPlayer(String identifier) {
    if ("mxplayer".equals(identifier)) {
      return new MXPlayer(videoContent, activity);
    }

    if ("mxplayerpro".equals(identifier)) {
      return new MXPlayerPro(videoContent, activity);
    }

    if ("vimu".equals(identifier)) {
      return new ViMuPlayer(videoContent, activity);
    }

    return new SystemDefaultPlayer(videoContent, activity);
  }
