@Override
    public CompletableFuture<RangeResult<ByteBuf, ByteBuf>> get(ByteBuf key, RangeOption<ByteBuf> option) {
        return underlying.get(key, key, option);
    }
