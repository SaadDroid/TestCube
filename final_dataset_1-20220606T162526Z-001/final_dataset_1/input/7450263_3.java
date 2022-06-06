@Override
   protected Object decode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {
      if (!(msg instanceof ChannelBuffer)) {
         return msg;
      }

      ChannelBuffer buf = (ChannelBuffer) msg;
      if (buf.hasArray()) {
         ByteArrayInputStream bis = new ByteArrayInputStream(buf.array(), buf.arrayOffset() + buf.readerIndex(),
               buf.readableBytes());
         Hessian2Input in = new Hessian2Input(bis);
         in.setSerializerFactory(factory);
         return in.readObject(Message.class);
      } else {
         Hessian2Input in = new Hessian2Input(new ChannelBufferInputStream((ChannelBuffer) msg));
         in.setSerializerFactory(factory);
         return in.readObject(Message.class);
      }
   }
