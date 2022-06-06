@Override
    public void handleException(Map<String, Object> ctx, final Throwable ex) {
        context = ctx;
        
        if (handler != null) {
            handler.handleResponse(new Response<T>() {
                protected boolean cancelled;

                public Map<String, Object> getContext() {
                    return context;
                }

                public boolean cancel(boolean mayInterruptIfRunning) {
                    cancelled = true;
                    return true;
                }

                public T get() throws InterruptedException, ExecutionException {
                    throw new ExecutionException(ex);
                }

                public T get(long timeout, TimeUnit unit)
                    throws InterruptedException, ExecutionException, TimeoutException {

                    throw new ExecutionException(ex);
                }

                public boolean isCancelled() {
                    return cancelled;
                }

                public boolean isDone() {
                    return true;
                }

            });
        }

        // The handler has to be called *before* future completes
        delegate.completeExceptionally(mapThrowable(ex));
        
        synchronized (this) {
            notifyAll();
        }
    }
