@Override
    public Worker createWorker() {
        return new HandlerWorker(handler, async);
    }
