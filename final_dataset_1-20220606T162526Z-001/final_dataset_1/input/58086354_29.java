@VisibleForTesting
  static void logSslEngineDetails(Level level, ChannelHandlerContext ctx, String msg,
                                                @Nullable Throwable t) {
    if (!log.isLoggable(level)) {
      return;
    }

    SslHandler sslHandler = ctx.pipeline().get(SslHandler.class);
    SSLEngine engine = sslHandler.engine();

    StringBuilder builder = new StringBuilder(msg);
    builder.append("\nSSLEngine Details: [\n");
    if (engine instanceof OpenSslEngine) {
      builder.append("    OpenSSL, ");
      builder.append("Version: 0x").append(Integer.toHexString(OpenSsl.version()));
      builder.append(" (").append(OpenSsl.versionString()).append("), ");
      builder.append("ALPN supported: ").append(OpenSsl.isAlpnSupported());
    } else if (JettyTlsUtil.isJettyAlpnConfigured()) {
      builder.append("    Jetty ALPN");
    } else if (JettyTlsUtil.isJettyNpnConfigured()) {
      builder.append("    Jetty NPN");
    }
    builder.append("\n    TLS Protocol: ");
    builder.append(engine.getSession().getProtocol());
    builder.append("\n    Application Protocol: ");
    builder.append(sslHandler.applicationProtocol());
    builder.append("\n    Need Client Auth: " );
    builder.append(engine.getNeedClientAuth());
    builder.append("\n    Want Client Auth: ");
    builder.append(engine.getWantClientAuth());
    builder.append("\n    Supported protocols=");
    builder.append(Arrays.toString(engine.getSupportedProtocols()));
    builder.append("\n    Enabled protocols=");
    builder.append(Arrays.toString(engine.getEnabledProtocols()));
    builder.append("\n    Supported ciphers=");
    builder.append(Arrays.toString(engine.getSupportedCipherSuites()));
    builder.append("\n    Enabled ciphers=");
    builder.append(Arrays.toString(engine.getEnabledCipherSuites()));
    builder.append("\n]");

    log.log(level, builder.toString(), t);
  }
