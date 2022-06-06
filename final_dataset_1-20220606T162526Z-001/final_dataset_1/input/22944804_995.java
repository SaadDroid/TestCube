@Override
    public void destroy(Session requester, Session session) throws SessionException {
        final long start = System.nanoTime();
        sessionOperations.destroy(requester, session);

        sessionMonitoringStore.storeDestroyTime(System.nanoTime() - start, monitorType);
    }
