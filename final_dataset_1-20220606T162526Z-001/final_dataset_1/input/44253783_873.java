@Override
  public SftpClient connect(SftpClient sftp, UserInfo ui) throws FileTransferException, IOException, PasswordException {
    boolean connected = false;
    for (SftpAuthenticationProvider p : getProviders()) {
      if (connect(sftp, ui, p)) {
        connected = true;
        break;
      }
    }
    if (!connected) {
      throw new FileTransferException("Failed to connect via any configured authentication providers");
    }
    return sftp;
  }
