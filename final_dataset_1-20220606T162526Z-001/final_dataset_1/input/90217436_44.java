public static void loginUsingKeytab(SmartConf conf) throws IOException{
    String keytabFilename = conf.get(SmartConfKeys.SMART_SERVER_KEYTAB_FILE_KEY);
    if (keytabFilename == null || keytabFilename.length() == 0) {
      throw new IOException("Running in secure mode, but config doesn't have a keytab");
    }
    File keytabPath = new File(keytabFilename);
    String principal = conf.get(SmartConfKeys.SMART_SERVER_KERBEROS_PRINCIPAL_KEY);
    try {
      SecurityUtil.loginUsingKeytab(principal, keytabPath.getAbsolutePath());
    } catch (IOException e) {
      LOG.error("Fail to login using keytab. " + e);
      throw new IOException("Fail to login using keytab. " + e);
    }
    LOG.info("Login successful for user: " + principal);
  }
