public void put(byte[] key, byte[] value, LevelDBWriteOptions writeOptions) {
        checkDatabaseOpen();
        writeOptions.checkWriteOptionsOpen();

        PointerByReference error = new PointerByReference();
        if (Native.POINTER_SIZE == 8) {
            long keyLength = key != null ? key.length : 0;
            long valueLength = value != null ? value.length : 0;
            LevelDBNative.leveldb_put(levelDB, writeOptions.writeOptions, key, keyLength, value, valueLength, error);
        } else {
            int keyLength = key != null ? key.length : 0;
            int valueLength = value != null ? value.length : 0;
            LevelDBNative.leveldb_put(levelDB, writeOptions.writeOptions, key, keyLength, value, valueLength, error);
        }
        LevelDBNative.checkError(error);
    }
