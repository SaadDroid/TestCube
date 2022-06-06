@Override
  public void channelInactive(ChannelHandlerContext ctx) throws Exception {
    try {
      logger.fine("Network channel is closed");
      lifecycleManager.notifyShutdown(
          Status.UNAVAILABLE.withDescription("Network closed for unknown reason"));
      cancelPing(lifecycleManager.getShutdownThrowable());
      // Report status to the application layer for any open streams
      connection().forEachActiveStream(new Http2StreamVisitor() {
        @Override
        public boolean visit(Http2Stream stream) throws Http2Exception {
          NettyClientStream clientStream = clientStream(stream);
          if (clientStream != null) {
            clientStream.transportReportStatus(
                lifecycleManager.getShutdownStatus(), false, new Metadata());
          }
          return true;
        }
      });
    } finally {
      // Close any open streams
      super.channelInactive(ctx);
    }
  }
