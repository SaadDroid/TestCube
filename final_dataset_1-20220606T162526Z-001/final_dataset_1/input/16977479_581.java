@Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        if (!started) {
            // The handler has to be called *before* future completes
            if (handler != null) {
                handler.failed(new CancellationException());
            }
            
            delegate.cancel(mayInterruptIfRunning);
            synchronized (this) {
                notifyAll();
            }
            
            return true;
        }

        return false;
    }
