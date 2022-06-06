@SuppressWarnings("unchecked")
    public void handleResponse(Map<String, Object> ctx, Object[] res) {
        context = ctx;
        
        // The handler has to be called *before* future completes
        if (handler != null) {
            handler.completed((T)res[0]);
        }
        
        delegate.complete(res);
        synchronized (this) {
            notifyAll();
        }
    }
