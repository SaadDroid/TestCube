public static void stopQuietly(Connection con) {
    if (con == null) return;
    try {
      con.stop();
    }
    catch (Exception e) {
    }
  }
