@Override public void run() {
    if (mediaServers.isEmpty()) {
      return;
    }
    Server server = mediaServers.values().iterator().next();
    String ipAddress = preferences.getString("server", "");
    if ("".equals(ipAddress)) {
      Editor edit = preferences.edit();
      edit.putString("server", server.getIPAddress());
      edit.apply();
      Toast.makeText(context,
          context.getResources().getText(R.string.auto_configuring_server_using_)
              + server.getServerName(), Toast.LENGTH_LONG).show();
      Activity activity = (Activity) context;
      activity.recreate();
    }
  }
