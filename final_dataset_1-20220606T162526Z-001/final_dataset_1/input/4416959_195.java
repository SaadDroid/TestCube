public List<String> getAttributeNames()
    {
        lock.acquireReadLock();

        return InternalUtils.toList(session.getAttributeNames());
    }
