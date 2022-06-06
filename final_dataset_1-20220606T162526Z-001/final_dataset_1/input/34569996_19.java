public byte[] get(byte[] key, LevelDBReadOptions readOptions) {
        checkDatabaseOpen();
        readOptions.checkReadOptionsOpen();

        PointerByReference resultLengthPointer = new PointerByReference();

        PointerByReference result;
        long resultLength;
        PointerByReference error = new PointerByReference();
        if (Native.POINTER_SIZE == 8) {
            long keyLength = key != null ? key.length : 0;
            result = LevelDBNative.leveldb_get(levelDB, readOptions.readOptions, key, keyLength, resultLengthPointer, error);
            LevelDBNative.checkError(error);

            resultLength = resultLengthPointer.getPointer().getLong(0);
        } else {
            int keyLength = key != null ? key.length : 0;
            result = LevelDBNative.leveldb_get(levelDB, readOptions.readOptions, key, keyLength, resultLengthPointer, error);
            LevelDBNative.checkError(error);

            resultLength = resultLengthPointer.getPointer().getInt(0);
        }

        byte[] resultAsByteArray = null;
        if (result != null) {
            resultAsByteArray = result.getPointer().getByteArray(0, (int) resultLength);
            LevelDBNative.leveldb_free(result.getPointer());
        }
        return resultAsByteArray;
    }
