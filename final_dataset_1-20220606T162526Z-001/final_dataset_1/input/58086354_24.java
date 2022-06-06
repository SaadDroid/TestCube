@Override
  public void start(Listener transportListener) {
    lifecycleManager = new ClientTransportLifecycleManager(
        Preconditions.checkNotNull(transportListener, "listener"));

    handler = newHandler();
    negotiationHandler = negotiator.newHandler(handler);

    Bootstrap b = new Bootstrap();
    b.group(group);
    b.channel(channelType);
    if (NioSocketChannel.class.isAssignableFrom(channelType)) {
      b.option(SO_KEEPALIVE, true);
    }
    /**
     * We don't use a ChannelInitializer in the client bootstrap because its "initChannel" method
     * is executed in the event loop and we need this handler to be in the pipeline immediately so
     * that it may begin buffering writes.
     */
    b.handler(negotiationHandler);
    // Start the connection operation to the server.
    channel = b.connect(address).addListener(new ChannelFutureListener() {
      @Override
      public void operationComplete(ChannelFuture future) throws Exception {
        if (!future.isSuccess()) {
          ChannelHandlerContext ctx = future.channel().pipeline().context(handler);
          if (ctx != null) {
            // NettyClientHandler doesn't propagate exceptions, but the negotiator will need the
            // exception to fail any writes. Note that this fires after handler, because it is as if
            // handler was propagating the notification.
            ctx.fireExceptionCaught(future.cause());
          }
          future.channel().pipeline().fireExceptionCaught(future.cause());
        }
      }
    }).channel();
    // Start the write queue as soon as the channel is constructed
    handler.startWriteQueue(channel);
    // This write will have no effect, yet it will only complete once the negotiationHandler
    // flushes any pending writes.
    channel.write(NettyClientHandler.NOOP_MESSAGE).addListener(new ChannelFutureListener() {
      @Override
      public void operationComplete(ChannelFuture future) throws Exception {
        if (!future.isSuccess()) {
          // Need to notify of this failure, because NettyClientHandler may not have been added to
          // the pipeline before the error occurred.
          lifecycleManager.notifyTerminated(Utils.statusFromThrowable(future.cause()));
        }
      }
    });
    // Handle transport shutdown when the channel is closed.
    channel.closeFuture().addListener(new ChannelFutureListener() {
      @Override
      public void operationComplete(ChannelFuture future) throws Exception {
        // Typically we should have noticed shutdown before this point.
        lifecycleManager.notifyTerminated(
            Status.INTERNAL.withDescription("Connection closed with unknown cause"));
      }
    });
  }
