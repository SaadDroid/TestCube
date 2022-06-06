@Override
    public Dispatcher getDispatcher(ServiceReference reference) {
        return _dispatchers.get(reference.getName());
    }
