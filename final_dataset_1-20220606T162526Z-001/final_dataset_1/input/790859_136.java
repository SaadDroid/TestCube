@Override
    public RemoteEndpoint selectEndpoint(QName serviceName) {
        if (getRegistry() == null) {
            return null;
        }
        RemoteEndpoint selectedEp = null;
        List<RemoteEndpoint> eps = getRegistry().getEndpoints(serviceName);
        if (!eps.isEmpty()) {
            _endpointIdxs.putIfAbsent(serviceName, new AtomicInteger(0));
            AtomicInteger idx = _endpointIdxs.get(serviceName);
            synchronized (idx) {
                idx.set(idx.get() % eps.size());
                selectedEp = eps.get(idx.getAndIncrement());
            }
        }
        
        return selectedEp;
    }
