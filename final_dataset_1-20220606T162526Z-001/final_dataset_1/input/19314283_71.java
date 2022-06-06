@Override
    public void close() throws Exception {
        if (closeable) {
            try {
                transferQueue.put(Optional.empty()); //an empty optional is the shutdown signal
                processingThread.get();
            } finally {
                destination.close();
            }
        }
    }
