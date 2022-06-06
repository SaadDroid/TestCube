public void compactRange(byte[] startKey, byte[] limitKey) {
        checkDatabaseOpen();

        if (Native.POINTER_SIZE == 8) {
            long startKeyLength = startKey != null ? startKey.length : 0;
            long limitKeyLength = limitKey != null ? limitKey.length : 0;
            LevelDBNative.leveldb_compact_range(levelDB, startKey, startKeyLength, limitKey, limitKeyLength);
        } else {
            int startKeyLength = startKey != null ? startKey.length : 0;
            int limitKeyLength = limitKey != null ? limitKey.length : 0;
            LevelDBNative.leveldb_compact_range(levelDB, startKey, startKeyLength, limitKey, limitKeyLength);
        }
    }
