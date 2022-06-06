CachedFileInfo loadFileInfo(long ledgerId, byte[] masterKey) throws IOException {
        lock.readLock().lock();
        try {
            CachedFileInfo fi = fileInfos.get(ledgerId);
            if (fi != null) {
                // tryRetain only fails if #markDead() has been called
                // on fi. This is only called from within the write lock,
                // and if it is called (and succeeds) the fi will have been
                // removed from fileInfos at the same time, so we should not
                // have been able to get a reference to it here.
                // The caller of loadFileInfo owns the refence, and is
                // responsible for calling the corresponding #release().
                return tryRetainFileInfo(fi);
            }
        } finally {
            lock.readLock().unlock();
        }

        File backingFile = fileLoader.load(ledgerId, masterKey != null);
        CachedFileInfo newFi = new CachedFileInfo(ledgerId, backingFile, masterKey);

        // else FileInfo not found, create it under write lock
        lock.writeLock().lock();
        try {
            CachedFileInfo fi = fileInfos.get(ledgerId);
            if (fi != null) {
                // someone is already putting a fileinfo here, so use the existing one and recycle the new one
                newFi.recycle();
            } else {
                fileInfos.put(ledgerId, newFi);
                fi = newFi;
            }

            // see comment above for why we assert
            return tryRetainFileInfo(fi);
        } finally {
            lock.writeLock().unlock();
        }
    }
