public DataBuffer toDataBuffer(Buffer buffer) {
        ByteBuf byteBuf = buffer.getByteBuf();
        return dataBufferFactory.wrap(byteBuf);
    }
