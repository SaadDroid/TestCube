@Override
    public void handleAsync(Executor worker, Consumer<NetworkMessage<Object>> handler) {
        ArgAssert.notNull(worker, "Worker");
        ArgAssert.notNull(handler, "Handler");

        buf.retain();

        worker.execute(() -> {
            try {
                handler.accept(this);
            } finally {
                buf.release();
            }
        });
    }
