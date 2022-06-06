@Override
    public T getSession(long id) {
        restoreAllSessionsIfNecessary();
        return sessionMap.get(id);
    }
